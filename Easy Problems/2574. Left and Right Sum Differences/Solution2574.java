public class Solution2574 {

    public static void main(String[] args) {
        int[] nums = new int[]{10,4,8,3};
        int[] answer = leftRightDifference(nums);
        System.out.println(answer);
    }


    static public int[] leftRightDifference(int[] nums) {
        int numsLen = nums.length;
        int[] answer = new int[numsLen];
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < numsLen; i++) {
            answer[i] = Math.abs(answer[i] - leftSum);
            answer[numsLen-i-1] = Math.abs(answer[numsLen-i-1] - rightSum);
            leftSum += nums[i];
            rightSum += nums[numsLen-i-1];             

        }
        return answer;
    }

    
}
