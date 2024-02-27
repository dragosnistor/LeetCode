import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1748 {


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int ans = sumOfUnique2(nums);
        System.out.println(ans);
    }

    static public int sumOfUnique(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> myMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int count = myMap.getOrDefault(nums[i], 0);
            if (count == 0) {
                ans += nums[i];
            } else if (count == 1) {
                ans -= nums[i];
            }
            myMap.put(nums[i], count + 1);
        }
        return ans;
    }

    static public int sumOfUnique2(int[] nums) {
        int ans = 0;
        int[] myArray = new int[101];

        for (int i = 0; i < nums.length; i++) {
            int count = myArray[nums[i]];
            
            if (count == 0) {
                ans += nums[i];
            } else if (count == 1){
                ans -= nums[i];
            }
            myArray[nums[i]] = count + 1; 
        }
        return ans;
    }

}