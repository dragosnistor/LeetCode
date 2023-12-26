import java.util.HashMap;
import java.util.Map;

public class Solution2006 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,1};
        int ans = countKDifference(nums, 1);
        System.out.println(ans); 
    }


    static public int countKDifference2(int[] nums, int k) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                int y = nums[j];
                int diff = Math.abs(x - y);

                if (diff == k) {
                    ans++;
                }
            }
        }
        return ans;
    }

    static public int countKDifference(int[] nums, int k) {
        int ans = 0;
        Map<Integer,Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            
            int smaller = myMap.getOrDefault(x - k, 0);            
            ans += smaller;
            
            int bigger = myMap.getOrDefault(x + k, 0);
            ans += bigger;

            int myNum = myMap.getOrDefault(x, 0);
            myMap.put(x, myNum + 1);
        }
        return ans;
    }
}