public class ConcatenationOfArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1};
        int[] ans = getConcatenation(nums);
        System.out.println(ans);
    }

    static public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];

        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++){
            ans[i + nums.length] = nums[i];
        }
        
        return ans;
    }
    
}
