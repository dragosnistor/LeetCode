public class Solution1832 {

    public static void main(String[] args) {
        String sentence = "leetcode";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }

    static public boolean checkIfPangram(String sentence) {
        boolean ans = true;

        if (sentence.length() < 26) {
            return false;
        }

        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'a');
            int charExists = sentence.indexOf(c);
            if (charExists == -1) {
                ans = false;
                break;
            }
        }
        return ans;
    }
    
}
