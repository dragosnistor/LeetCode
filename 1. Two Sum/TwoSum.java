public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[] {3,2,4};
        int target = 6;
        int[] answer = twoSum(nums, target);
        System.out.println(answer);
    }

    static public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        outer: for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            inner: for (int j = i + 1; j < nums.length; j++){
                if (nums[j] == diff){
                    answer[0] = i;
                    answer[1] = j;
                    break outer;
                }
            }
        }
        return answer;
    }

    
}
