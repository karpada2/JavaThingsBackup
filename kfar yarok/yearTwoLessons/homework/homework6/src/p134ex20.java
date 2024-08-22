import java.util.*;

public class p134ex20 {

    static Scanner sc = new Scanner(System.in);

    public static int howManyExist(Stack<DominoStone> heap, DominoStone stone) {

        Stack<DominoStone> temp = new Stack<DominoStone>();
        Stack<DominoStone> main = new Stack<DominoStone>();
        while (!heap.isEmpty()) {
            temp.push(heap.pop());
        }
        while (!temp.isEmpty()) {
            main.push(temp.top());
            heap.push(temp.pop());
        }

        int stoneValueOneAppears = 0;
        int stoneValueTwoAppears = 0;
        while (!main.isEmpty()) {
            if (main.top().getValueOne() == stone.getValueOne() || main.top().getValueTwo() == stone.getValueTwo()) {
                stoneValueOneAppears++;
            }
            if (main.top().getValueOne() == stone.getValueTwo() || main.top().getValueTwo() == stone.getValueTwo()) {
                stoneValueTwoAppears++;
            }
            main.pop();
        }

        if (stone.getValueOne() == stone.getValueTwo()) {
            if (stoneValueOneAppears >= 2) {
                return 2;
            }
        }

        if (stoneValueOneAppears >= 1 || stoneValueTwoAppears >= 1) {
            if (stoneValueOneAppears >= 1 && stoneValueTwoAppears >= 1) {
                return 2;
            }
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter heap size");
        int heapSize = sc.nextInt();
        Stack<DominoStone> heap = new Stack<DominoStone>();
        System.out.println("Enter domino stones' values");
        int valueTemp;
        for (int i = 0; i < heapSize; i++) {
            valueTemp = sc.nextInt();
            heap.push(new DominoStone(valueTemp, sc.nextInt()));
            System.out.println("-------");
        }

        System.out.println("Enter unique stone values");
        valueTemp = sc.nextInt();
        DominoStone stone = new DominoStone(valueTemp, sc.nextInt());

        System.out.println(howManyExist(heap, stone));
    }
}
