import java.util.ArrayList;
import java.util.List;

public class Solution2553 {
    
    public static void main(String[] args) {
        int[] nums = new int[]{1,5,10,15,50,100,150,1000,1500,10000,15000};
        int[] ans = separateDigits2(nums);
        System.out.println(ans);
    }

    static public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            for (char c : String.valueOf(nums[i]).toCharArray()) {
                ans.add(c - '0');
            }
        }            
        return ans.stream()
        .mapToInt(Integer::intValue)
        .toArray();
    }

    static public int[] separateDigits2(int[] nums) {
        int totalDigits = 0;

        for (int n : nums) {
            double result = Math.log10(n);
            totalDigits += (int) result + 1;
        }

        int len = nums.length;
        
        if (totalDigits == len) {
            return nums;
        }

        int[] ans = new int[totalDigits];
        totalDigits -= 1;

        for (int i = len - 1; i > -1; i--) {
            int t = nums[i];
            while(t != 0) {
                ans[totalDigits--] = t % 10;
                t /= 10;
            }
        }
        return ans;
    }

}
