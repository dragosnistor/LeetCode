public class Solution2185 {

    public static void main(String[] args) {
        String[] words = new String[]{"pay","attention","practice","attend"};
        String pref = "at";
        int ans = prefixCount(words, pref);
        System.out.println(ans);
    }

    static public int prefixCount(String[] words, String pref) {
        int ans = 0;
        int len = pref.length();

        for (int i = 0; i < words.length; i++) {
            int lenWord = words[i].length();

            if (len > lenWord) { 
                continue;
            }

            if (words[i].startsWith(pref)) {
                ans++;
            }
        }
        return ans;
    }

    
}
