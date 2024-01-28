import java.util.HashMap;
import java.util.Map;

public class Solution3005 {
    
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        int ans = maxFrequencyElements(nums);
        System.out.println(ans);
    }

    static public int maxFrequencyElements(int[] nums) {
        int ans = 0;
        int max = 0;
        Map<Integer,Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int count = myMap.getOrDefault(nums[i], 0);
            myMap.put(nums[i], count + 1);

            if ((count + 1) > max){
                max = count + 1;
            }  
        }

        for (Integer x : myMap.keySet()) {
            if (myMap.get(x) == max){
                ans += max;
            }
        }
        return ans;
    }
}
