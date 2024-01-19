public class Solution344 {

    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
    }

   static public void reverseString(char[] s) {
        int len = s.length;


        for (int i = 0; i <= ((len - 1) / 2); i++) {
            char a = s[i];
            s[i] = s[len - 1 -i];
            s[len - 1 -i] = a;
        }

        System.out.println(String.valueOf(s));
    }

    
}
