import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1,1,3};
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);

        int[] nums2 = new int[]{1,1,1,1};
        int ans2 = numIdenticalPairs(nums2);
        System.out.println(ans2);

        int[] nums3 = new int[]{1,2,3};
        int ans3 = numIdenticalPairs(nums3);
        System.out.println(ans3);

    }

    // Time complexity: O(n^2) 
    // simplified from (n^2 + n ) / 2  ->  because the addition term in the numerator and the constand term in the denominator are both ignored 
    // Space complexity: O(1)

    // static public int numIdenticalPairs(int[] nums) {
    //     int goodPairs = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i+1; j < nums.length; j++) {
    //             if (nums[i]==nums[j]){
    //                 goodPairs++;
    //             }
    //         }
    //     }
    //     return goodPairs;
    // }

    // Time complexity: O(n)
    // Space complexity: O(n)

    static public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int myPair = myMap.getOrDefault(nums[i], 0);
            myMap.put(nums[i], myPair+1);
            goodPairs = goodPairs + myPair; 
        }

        return goodPairs;
    }

    
}
