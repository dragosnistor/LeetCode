public class Solution1816 {

    public static void main(String[] args) {
        String s = "chopper is not a tanuki";
        int k = 5;
        String ans = truncateSentence(s, k);
        System.out.println(ans);
    }

    static public String truncateSentence2(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int wordCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                wordCount++;
            }

            if (wordCount == k) {
                break;
            }

            ans.append(c);
        }

        return ans.toString();
    }


    static public String truncateSentence(String s, int k) {
        int wordCount = 0;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                wordCount++;
            }

            if (wordCount == k) {
                break;
            }

            index++;
        }

        return s.substring(0, index);
    }

    
}
