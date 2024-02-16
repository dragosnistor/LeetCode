public class Solution2176 {
    
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,2,2,2,1,3}; 
        int k = 2;
        int ans = countPairs(nums, k);
        System.out.println(ans);
    }

    static public int countPairs(int[] nums, int k) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j] && i * j % k == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }

}
