public class book2p25ex16 {
    // "good" = "ogdo"
    // "there" = "htree"
    public static String flipPairs(String str) {
        String output = "";
        for (int i = 1; i < str.length(); i += 2) {
            output = output.concat(str.substring(i,i+1));
            output = output.concat(str.substring(i-1, i));
        }
        if (output.length() != str.length()) {
            output += str.substring(str.length()-1);
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(flipPairs("good"));
    }
}
