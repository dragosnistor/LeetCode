public class Solution1662 {

    public static void main(String[] args) {
        String[] word1 = new String[]{"abc", "d", "defg"};
        String[] word2 = new String[]{"abcddefg"};
        boolean ans = arrayStringsAreEqual(word1, word2);
        System.out.println(ans);
    }

    static public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean ans = false;

        for (String word : word1) {
            sb1.append(word);
        }

        for (String word : word2) {
            sb2.append(word);
        }

        if (sb1.compareTo(sb2) == 0) {
            ans = true;
        }

        return ans;
    }
                
}
