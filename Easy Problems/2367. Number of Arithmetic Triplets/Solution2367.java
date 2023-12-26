import java.util.HashMap;
import java.util.Map;

public class Solution2367 {
    
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,8,9};
        int diff = 2;
        int ans = arithmeticTriplets(nums, diff);
        System.out.println(ans);
    }

    static public int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];

            int onceDiff = myMap.getOrDefault(x - diff, 0);
            int twiceDiff = myMap.getOrDefault(x - (diff * 2), 0);

            if (onceDiff != 0 && twiceDiff != 0) {
                ans++;
            }

            myMap.put(x, 1);
        }
        return ans;
    }

}
