public class Main {
    public static void sell(Queue<Box> q, int kind, double amount) {
        Queue<Box> temp = new Queue<Box>();
        double remaining = amount;

        while (!q.isEmpty() && remaining != 0) {
            if (q.head().getKind() == kind) {
                if (remaining != 0) {
                    if (q.head().getAmount() > remaining) {
                        q.head().setAmount(q.head().getAmount()-remaining);
                        remaining = 0;
                    } else if (q.head().getAmount() == remaining) {
                        remaining = 0;
                        q.remove();
                    } else {
                        remaining -= q.head().getAmount();
                        q.remove();
                    }
                }
            } else {
                temp.insert(q.remove());
            }
        }

        while (!temp.isEmpty()) {
            q.insert(temp.remove());
        }

        if (remaining == 0) {
            System.out.println("Customer got everything they wanted");
        } else {
            System.out.println("Not enough things for the customer to get");
        }
    }

    public static Queue<Box>[] splitQueue(Queue<Box> q) {
        Queue[] returnArr = new Queue[6]; //index 0 isn't used
        for (int i = 1; i < returnArr.length; i++) {
            returnArr[i] = new Queue<Box>();
        }
        while (!q.isEmpty()) {
            returnArr[q.head().getKind()].insert(q.remove());
        }

        return returnArr;
    }

    public static void main(String[] args) {
        Queue<Box> test = new Queue<Box>();

        test.insert(new Box(13.2, 2));
        test.insert(new Box(613, 4));
        test.insert(new Box(15.12, 5));
        test.insert(new Box(123.23, 3));
        test.insert(new Box(16.4, 1));
        test.insert(new Box(13.8, 1));

        Queue[] arr = splitQueue(test);
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
