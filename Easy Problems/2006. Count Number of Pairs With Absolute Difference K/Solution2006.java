public class Solution2006 {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,5,4};
        int ans = countKDifference(nums, 2);
        System.out.println(ans); 
    }


    static public int countKDifference(int[] nums, int k) {
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

}