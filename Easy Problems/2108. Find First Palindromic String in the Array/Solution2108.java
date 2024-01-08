public class Solution2108 {

    public static void main(String[] args) {
        String[] words = new String[]{"def","ghi"};
        String ans = firstPalindrome(words);
        System.out.println(ans);
    }

    static public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String reverse = new StringBuilder(words[i]).reverse().toString();
            if (words[i].equals(reverse)) {
                return words[i];
            }
        }        
        return "";
    }
}
