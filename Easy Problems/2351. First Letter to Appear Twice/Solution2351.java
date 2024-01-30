import java.util.HashMap;
import java.util.Map;

public class Solution2351 {
    
    public static void main(String[] args) {
        String s = "abccbaacz";
        char ans = repeatedCharacter(s);
        System.out.println(ans);       
    }

    static public char repeatedCharacter(String s) {
        Map<Character, Integer> myMap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++){
            int count = myMap.getOrDefault(s.charAt(i), 0);

            if (count == 1) {
                return s.charAt(i);
            }

            myMap.put(s.charAt(i), count + 1);
        }
        return ' ';
    }


}
