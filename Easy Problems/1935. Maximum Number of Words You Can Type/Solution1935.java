import java.util.HashSet;
import java.util.Set;

public class Solution1935 {
    
    public static void main(String[] args) {
        String text = "hello world"; 
        String brokenLetters = "ad";
        int ans = canBeTypedWords2(text, brokenLetters);
        System.out.println(ans);
    }

    static public int canBeTypedWords(String text, String brokenLetters) {
        int ans = 0;
        boolean correctWord = true;
        String[] myArray = text.split(" ");

        outer: for (int i = 0; i < myArray.length; i++) {

            inner: for (int j = 0; j < myArray[i].length(); j++) {
                if (brokenLetters.indexOf(myArray[i].charAt(j)) >= 0) {
                    correctWord = false;
                    break inner;
                }
            }
            if (correctWord == true) {
                ans++;
            }
            correctWord = true;
        }
        return ans;
    }

    static int ans = 0;

    static public int canBeTypedWords2(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            set.add(c);
        }
        String[] arr = text.split(" ");

        for (int i = 0; i < arr.length; i++) {
            traverse(arr[i], set);
        }
        return ans;
    }

    static public void traverse(String s, Set<Character> set) {
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return;
            }
        }
        ans++;
    }
}
