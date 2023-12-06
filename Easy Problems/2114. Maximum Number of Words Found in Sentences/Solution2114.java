public class Solution2114 {

    public static void main(String[] args) {
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int ans = mostWordsFound(sentences);
        System.out.println(ans);
    }


    static public int mostWordsFound(String[] sentences) {
        int ans = 0;

        for (int i = 0; i < sentences.length; i++){
            // split is 10 times faster than the replaceAll
            int words = sentences[i].split(" ").length;
            // int len = sentences[i].replaceAll("[a-z]", "").length() + 1;

            if (words > ans) {
                ans = words;
            }
        }
        return ans;
    }

    
}
