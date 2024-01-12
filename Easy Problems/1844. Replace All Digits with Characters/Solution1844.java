public class Solution1844 {

    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        String ans = replaceDigits(s);
        System.out.println(ans);
    }

    static public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 1; i < s.length(); i += 2) {
            char letter = sb.charAt(i-1);
            int digit = sb.charAt(i) - '0';
            char letterFromDigit = (char) (letter + digit);
            sb.setCharAt(i, letterFromDigit);
        }
        return sb.toString();
    }


}
