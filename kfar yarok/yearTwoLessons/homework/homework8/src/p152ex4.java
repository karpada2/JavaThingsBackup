public class p152ex4 {
    public static void pushToStart(Queue<String> q, String str) {
        Queue<String> temp = new Queue<String>();
        while (!q.isEmpty()) {
            temp.insert(q.remove());
        }
        q.insert(str);
        while (!temp.isEmpty()) {
            q.insert(temp.remove());
        }
    }

    public static boolean isGuessGoldenBall(Queue<String> cylinder, int amountToTakeOut) {
        Stack<String> temp = new Stack<String>();
        for (int i = 1; i < amountToTakeOut; i++) {
            if (cylinder.isEmpty()) {
                while (!temp.isEmpty()) {
                    pushToStart(cylinder, temp.pop());
                }
            }
            temp.push(cylinder.remove());
        }

        boolean isHeadGolden = !cylinder.isEmpty() && cylinder.head().equalsIgnoreCase("gold");

        while (!temp.isEmpty()) {
            pushToStart(cylinder, temp.pop());
        }
        return isHeadGolden;
    }

    public static void main(String[] args) {
        Queue<String> cylinder = new Queue<String>();

        cylinder.insert("yellow");
        cylinder.insert("red");
        cylinder.insert("pink");
        cylinder.insert("gold");
        cylinder.insert("blue");

        System.out.println("guess 4: " + isGuessGoldenBall(cylinder, 4));
        System.out.println("guess 6: " + isGuessGoldenBall(cylinder, 6));
        System.out.println("guess 9: " + isGuessGoldenBall(cylinder, 9));

    }
}
