import java.util.HashSet;
import java.util.Set;

public class Solution2716 {

    public static void main(String[] args) {
        String s = "cbbd";
        int ans = minimizedStringLength4(s);
        System.out.println(ans);
    }

    static public int minimizedStringLength(String s) {
        Set<Character> mySet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (!mySet.contains(s.charAt(i))){
                mySet.add(s.charAt(i));
            }
        }
        return mySet.size();
    }
  
    static public int minimizedStringLength1(String s) {
        Set<Character> mySet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            mySet.add(s.charAt(i));
        }
        return mySet.size();
    }

    static public int minimizedStringLength2(String s) {
        char[] chars = new char[26];
        int ans = 0;

        for (char c : s.toCharArray()) {
            if (chars[c - 'a'] == '\u0000') {
                chars[c - 'a'] = c;
            }
        }
        for (char c : chars) {
            if (c != '\u0000') {
                ans++;
            }
        }
        return ans;
    }

    static public int minimizedStringLength3(String s) {
        char[] chars = new char[26];
        int ans = 0;

        for (char c : s.toCharArray()) {
            chars[c - 'a'] = c;
        }
        for (char c : chars) {
            if (c != '\u0000') {
                ans++;
            }
        }
        return ans;
    }

    static public int minimizedStringLength4(String s) {
        return (int) s.chars().distinct().count();
    }
}
