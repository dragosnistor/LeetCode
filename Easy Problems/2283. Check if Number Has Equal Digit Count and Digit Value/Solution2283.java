import java.util.HashMap;
import java.util.Map;

public class Solution2283 {
    
    public static void main(String[] args) {
        String num = "030";
        boolean ans = digitCount(num);
        System.out.println(ans);
    }


   static public boolean digitCount(String num) {
        Map<Integer,Integer> myMap = new HashMap<>();

        for (int i = 0; i < num.length(); i++) {
            
            int n = num.charAt(i) - '0';
            int count = myMap.getOrDefault(n, 0);
            myMap.put(n, count + 1);
        }

        for (int i = 0; i < num.length(); i++) {

            int n = num.charAt(i) - '0';
            int occurance = myMap.getOrDefault(i, 0);
            if (n != occurance) {
                return false;
            }
        }
        return true;
    }


}
