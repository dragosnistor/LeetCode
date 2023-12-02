import java.util.HashMap;
import java.util.Map;

public class SingleRowKeyboard {

    public static void main(String[] args) {
        String keyboard = "pqrstuvwxyzabcdefghijklmno";
        String word = "leetcode";
        int ans = calculateTime(keyboard, word);
        System.out.println(ans);
    }

    static public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> myMap = new HashMap<>();
        int ans = 0;
        int pos = 0;
    
        for (int i = 0; i < keyboard.length(); i++) {
            char k = keyboard.charAt(i);
            myMap.put(k, i);
        }

        for (int j = 0; j < word.length(); j++) {
            char w = word.charAt(j);
            ans += Math.abs(pos - myMap.get(w));
            pos = myMap.get(w);
        }

        return ans;
    }

    
}
