public class p133ex16 {
    public static void secretCode(String s) {
        Stack<Character> st = new Stack<>();
        Stack<Character> flip = new Stack<>();
        int count = 0;
        while(count != s.length()){
            if(count % 5 == 0){
                returnCh(st,flip);
            }
            flip.push(s.charAt(count));
            count++;
        }
        Stack<Character> fin = new Stack<>();
        while(!flip.isEmpty()){
            st.push(flip.pop());
        }
        while(!st.isEmpty()){
            fin.push(st.pop());
        }
        System.out.println(fin);
    }

    public static Stack<Character> returnCh(Stack<Character> s, Stack<Character> temp){
        while (!temp.isEmpty()){
            s.push(temp.pop());
        }
        return s;
    }
}
