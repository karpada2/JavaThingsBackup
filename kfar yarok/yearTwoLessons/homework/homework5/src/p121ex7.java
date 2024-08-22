import java.util.*;

public class p121ex7 {

    static Scanner sc = new Scanner(System.in);

    public static String websiteHistory(Stack<String> history, String str) {
        Stack<String> temp = new Stack<String>();
        Stack<String> main = new Stack<String>();

        while (!history.isEmpty()) {
            temp.push(history.pop());
        }

        while (!temp.isEmpty()) {
            history.push(temp.top());
            main.push(temp.pop());
        }

        if (str.length() == 4) {
            main.pop();
            if (!main.isEmpty()) {
                return main.top();
            }
            return "";
        }

        int i = sc.nextInt();

        while (!main.isEmpty() && i > 0) {
            if (i == 1) {
                return main.top();
            }
            i--;
            main.pop();
        }
        return "";
    }

    public static void main(String[] args) {
        Stack<String> history = new Stack<String>();
        System.out.println("websites");
        for (int i = 0; i < 4; i++) {
            history.push(sc.nextLine());
        }
        System.out.println("Type BackX");
        System.out.println(websiteHistory(history, sc.nextLine()));
    }
}
