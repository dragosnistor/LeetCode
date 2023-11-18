public class NumberOfGoodPairs {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1,1,3};
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
        

    }

    static public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }

    
}
