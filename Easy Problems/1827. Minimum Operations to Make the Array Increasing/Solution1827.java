public class Solution1827 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,5,2,4,1};
        int ans = minOperations(nums);
        System.out.println(ans);
    }

    static public int minOperations(int[] nums) {
        int ans = 0;
        int len = nums.length;

        if (len == 1) {
            return ans;
        }

        for (int i = 1; i < len; i++) {
            int x = nums[i - 1];
            int y = nums[i];

            if (y <= x) {
                int diff = x - y + 1;
                ans += diff;
                nums[i] += diff;    
            }
        }
        return ans;
    }

    
}
