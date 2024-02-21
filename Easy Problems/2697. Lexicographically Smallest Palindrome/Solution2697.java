public class Solution2697 {
    
    public static void main(String[] args) {
        String s = "egcfe";
        String ans = makeSmallestPalindrome(s);
        System.out.println(ans);
    }

    static public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int mid = s.length() / 2;

        for (int i = 0; i < mid; i++){
            char right = sb.charAt(i);
            char left = sb.charAt(s.length() - 1 - i);

            if (left < right) {
                sb.setCharAt(i, left);
            } else if (left > right){
                sb.setCharAt(s.length() - 1 - i, right);
            }
        }

        return sb.toString();
    }


    static public String makeSmallestPalindrome2(String s) {
        char[] ch = s.toCharArray();

        for (int i = 0, j = ch.length - 1; i < j; i++, j--) {
            if (ch[i] != ch[j]) {
                char smallerChar = (char) Math.min(ch[i], ch[j]);
                ch[i] = smallerChar;
                ch[j] = smallerChar;
            }
        }

        return new String(ch);
    }


    static public String makeSmallestPalindrome3(String s) {
        char str[] = s.toCharArray();
        int i=0, j=s.length()-1;
        while(i<j){
            str[i] = (char)Math.min(str[i],str[j]);
            str[j]= str[i];
            i++;
            j--;
        }
        return new String(str);
    }

}
