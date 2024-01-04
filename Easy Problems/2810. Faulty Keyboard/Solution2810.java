public class Solution2810 {

    public static void main(String[] args) {
        String s = "string";
        String ans = finalString(s);
        System.out.println(ans);
    }

    static public String finalString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'i') {
                sb.reverse();
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    
}
