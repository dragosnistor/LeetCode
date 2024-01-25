public class Solution2255 {
 
    public static void main(String[] args) {
        String[] words = new String[]{"a","a"};
        String s = "aa";
        int ans = countPrefixes(words, s);
        System.out.println(ans);
    }


    static public int countPrefixes(String[] words, String s) {
        int ans = 0;

        for (int i = 0; i < words.length; i++) {
            if (s.startsWith(words[i])) {
                ans++;
            }
        }
        return ans;
    }


}
