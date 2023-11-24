public class ShuffleTheArray {
    
    public static void main(String[] args){
        int[] nums = new int[]{2,5,1,3,4,7};
        int n = 3;
        int[] ans = shuffle(nums, n);
        System.out.println(ans.toString());
    } 

    static public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        for (int i = 0; i < n; i++){
            ans[i*2] = nums[i];
            ans[i*2+1] = nums[i+n];
        }
        return ans;
    }


}
