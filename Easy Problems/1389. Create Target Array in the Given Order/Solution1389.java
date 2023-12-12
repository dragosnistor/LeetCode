import java.util.ArrayList;
import java.util.List;

public class Solution1389 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,0};
        int[] index = new int[]{0,1,2,3,0};
        int[] ans = createTargetArray(nums, index);
    }

    static public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> myNums = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            myNums.add(index[i], nums[i]);
        }
        return myNums.stream().mapToInt(Integer::intValue).toArray();
    }

    
}
