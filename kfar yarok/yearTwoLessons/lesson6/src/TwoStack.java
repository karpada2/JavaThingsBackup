public class TwoStack {
    private Stack<Integer> numbers;
    private Stack<Integer> sums;

    public Stack<Integer> getNums(int x) {
        Stack<Integer> main = new Stack<Integer>();
        Stack<Integer> returnStack = new Stack<Integer>();

        while (!this.numbers.isEmpty()) {
            main.push(numbers.pop());
            returnStack.push(numbers.pop());
        }
        while (!returnStack.isEmpty()) {
            numbers.push(returnStack.pop());
        }

        int sum = 0;
        while (sum != x && !this.numbers.isEmpty()) {
            returnStack.push(this.numbers.pop());
            sum += returnStack.top();
        }

        return returnStack;
    }

    public Stack<Integer> buildSum() {
        Stack<Integer> main = new Stack<Integer>();
        Stack<Integer> temp = new Stack<Integer>();

        while (!numbers.isEmpty()) {
            main.push(numbers.top());
            temp.push(numbers.pop());
        }

        while (!temp.isEmpty()) {
            numbers.push(temp.pop());
        }

        sums = new Stack<Integer>();

        sums.push(main.pop());

        while (!main.isEmpty()) {
            sums.push(sums.top() + main.pop());
        }

        return sums;
    }

    public void eraseNum(int x) {
        if (this.numbers.top() == x) {
            this.numbers.pop();
        } else {
            Stack<Integer> temp = new Stack<Integer>();
            while (this.numbers.top() != x) {
                temp.push(this.numbers.pop());
            }
            this.numbers.pop();

            while (!temp.isEmpty()) {
                numbers.push(temp.pop());
            }
        }

        buildSum();
    }
}
