public class Solution709 {

    public static void main(String[] args) {
        String s = "LOVELY";
        String ans = toLowerCase(s);
        System.out.println(ans);
    }

    static public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 'A' = 65, 'Z' = 90
            // 'a' = 97, 'z' = 122
            // ' ' = 32
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + ' '));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
}
