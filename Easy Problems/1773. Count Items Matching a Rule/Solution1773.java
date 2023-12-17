import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1773 {

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>(Arrays.asList());
        items.add(List.of("phone","blue","pixel"));
        items.add(List.of("computer","silver","phone"));
        items.add(List.of("phone","gold","iphone"));
        String ruleKey = "type";
        String ruleValue = "phone";
        int ans = countMatches(items, ruleKey, ruleValue);
        System.out.println(ans);
    }

    static public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        int ans = 0;

        switch (ruleKey) {
            case "type":
                index = 0;        
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }

        for (int i = 0; i < items.size(); i++) {
            String lookupValue = items.get(i).get(index);

            if (ruleValue.equals(lookupValue)) {
                ans++;
            }   
        }
        return ans;
    }
    
}
