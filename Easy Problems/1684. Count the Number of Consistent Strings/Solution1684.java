import java.util.HashSet;
import java.util.Set;

public class Solution1684 {

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = new String[]{"ad","bd","aaab","baa","badab"};
        int ans = countConsistentStrings(allowed, words);
        System.out.println(ans);
    }

    static public int countConsistentStrings2(String allowed, String[] words) {
        int ans = 0;

        outer: for (int j = 0; j < words.length; j++) {
            String word = words[j];

        inner:    for (int k = 0; k < word.length(); k++) {
                char c = word.charAt(k);
                
                if (allowed.indexOf(c) < 0) {
                    break inner;
                }

                if (k == word.length() - 1) {
                    ans++;
                }
            }
        }
        return ans;
    }


    static public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> mySet = new HashSet<>();
        int ans = 0;

        for (int i = 0; i < allowed.length(); i++) {
            mySet.add(allowed.charAt(i));
        }

        outer: for (int j = 0; j < words.length; j++) {
            String word = words[j];

        inner:    for (int k = 0; k < word.length(); k++) {
                char c = word.charAt(k);
                
                if (!mySet.contains(c)) {
                    break inner;
                }

                if (k == word.length() - 1) {
                    ans++;
                }
            }
        }
        return ans;
    }

}
