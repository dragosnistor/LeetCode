public class Solution1768 {

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        String ans = mergeAlternately(word1, word2);
        System.out.println(ans);
    }

    static public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int min = Math.min(word1.length(), word2.length());

        for (int i = 0; i < min; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if (word1.length() > min) {
            sb.append(word1.substring(min));
        } else if (word2.length() > min) {
            sb.append(word2.substring(min));
        }
        return sb.toString();
    }
    
}
