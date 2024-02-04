public class Solution3028 {
    
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,-3,-4};
        int ans = returnToBoundaryCount(nums);
        System.out.println(ans);

    }

    static public int returnToBoundaryCount(int[] nums) {
        int ans = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            if (sum ==0) {
                ans++;
            }
        }
        return ans;
    }


}
