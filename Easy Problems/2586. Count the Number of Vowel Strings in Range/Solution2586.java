import java.util.Set;

public class Solution2586 {

    public static void main(String[] args) {
        String[] words = new String[]{"hey","aeo","mu","ooo","artro"};
        int left = 1;
        int right = 4;
        int ans = vowelStrings(words, left, right);
        System.out.println(ans);
    }

    static public int vowelStrings2(String[] words, int left, int right) {
        int ans = 0;
        Set<Character> mySet = Set.of('a', 'e', 'i', 'o', 'u');
        
        for (int i = left; i <= right; i++) {
            int len = words[i].length();
            char firstLetter = words[i].charAt(0);
            char lastLetter = words[i].charAt(len - 1);

            if (mySet.contains(firstLetter) && mySet.contains(lastLetter)) {
                ans++;
            }
        }
        return ans;
    }

    static public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        
        for (int i = left; i <= right; i++) {
            int len = words[i].length();
            char firstLetter = words[i].charAt(0);
            char lastLetter = words[i].charAt(len - 1);

            if (isVowel(firstLetter) && isVowel(lastLetter)) {
                ans++;
            }
        }
        return ans;
    }

    static public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
