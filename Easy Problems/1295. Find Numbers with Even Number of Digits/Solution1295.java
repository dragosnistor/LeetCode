public class Solution1295 {
    
    public static void main(String[] args) {
        int[] nums = new int[]{555,901,482,1771};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    static public int findNumbers(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 10 && nums[i] <= 99 
            || nums[i] >= 1000 && nums[i] <= 9999
            || nums[i] == 100000) {
                ans++;
            }
        }
        return ans;
    }

    public int findNumbers2(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if ((int)Math.log10(n) % 2 == 1){ // Math.log10 of an even digit number is always an odd number whose modulus with 2 always gives 1;
                count++;
            }
        }
        return count;

}
