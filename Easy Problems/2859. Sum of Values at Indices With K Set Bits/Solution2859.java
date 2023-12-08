import java.util.List;
import java.util.Arrays;

public class Solution2859 {
    
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,3,2,1);
        int k = 2;
        int ans = sumIndicesWithKSetBits(nums, k);
        System.out.println(ans);
    }

    static public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {

            if (Integer.bitCount(i) == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }
}
