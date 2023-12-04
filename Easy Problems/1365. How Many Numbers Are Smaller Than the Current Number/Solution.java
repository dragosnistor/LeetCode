class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(ans);
    }

    static public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++){
                if (j !=i && nums[j] < nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}