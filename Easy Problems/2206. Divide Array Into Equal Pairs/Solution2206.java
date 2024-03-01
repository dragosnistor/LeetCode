import java.util.HashMap;
import java.util.Map;

public class Solution2206 {
    
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        boolean ans = divideArray(nums);
        System.out.println(ans);
    }

    static public boolean divideArray(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            myMap.put(nums[i], myMap.getOrDefault(nums[i], 0) + 1);
        }

        for (int key : myMap.keySet()) {
            if (myMap.get(key) % 2 != 0) {
                return false;
            }
        }
        return true;
    }

}
