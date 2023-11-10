public class RunningSumOf1dArray {

    public static void main(String[] args) {
        int[] myArray = new int[]{1,2,3,4};
        System.out.println(runningSum(myArray));
    }

    // static public int[] runningSum(int[] nums) {
    //     int[] myReturnArray = new int[nums.length]; 
    //     int myRunningSum = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         myRunningSum += nums[i];
    //         myReturnArray[i] = myRunningSum;
    //     }
    //     return myReturnArray;
    // }

    static public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }


}
