public class Solution2535 {
    
    
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int ans = differenceOfSum(nums);
        System.out.println(ans);
    }
    
    
    static public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            elementSum += number;
            
            while (number != 0) {
                int digit = number % 10; 
                digitSum += digit;
                number /= 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
    
}
