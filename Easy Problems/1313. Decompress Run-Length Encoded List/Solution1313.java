import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution1313 {
    
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,3};
        int[] ans = decompressRLElist(nums);
        System.out.println(ans);
    }

    static public int[] decompressRLElist(int[] nums) {
        int size = 0;

        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] ans = new int[size];

        int start = 0;
        for (int j = 0; j < nums.length; j += 2) {
            Arrays.fill(ans, start, start + nums[j], nums[j + 1]);
            start += nums[j];
        }

        return ans;
    }

}
