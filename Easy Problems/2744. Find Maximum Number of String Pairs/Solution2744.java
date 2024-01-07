import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution2744 {
    
    public static void main(String[] args) {
        String[] words = new String[]{"cd","ac","dc","ca","zz"};
        int ans = maximumNumberOfStringPairs(words);
        System.out.println(ans);
    }

    static public int maximumNumberOfStringPairs2(String[] words) {
        int ans = 0;
        Map<String,Integer> myMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String myString = words[i];
            StringBuilder sb = new StringBuilder(myString);
            sb.reverse();

            if (myMap.get(sb.toString()) != null) {
                ans++;
                myMap.put(sb.toString(), 1);
                myMap.put(myString, 1);
            }
            myMap.put(myString, 0);
        }
        return ans;
    }


    static public int maximumNumberOfStringPairs(String[] words) {
        int ans = 0;
        Set<String> mySet = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String myString = words[i];
            StringBuilder sb = new StringBuilder(myString);
            sb.reverse();

            if (mySet.contains(sb.toString())) {
                ans++;
            }
            mySet.add(myString);
        }
        return ans;
    }

}
