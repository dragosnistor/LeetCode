import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class CountPairsWhoseSumIsLessThanTarget {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(-6,2,5,-2,-7,-1,3));
        int target = -2;
        int ans = countPairs(nums, target);
        System.out.println(ans);
    }

    static public int countPairs(List<Integer> nums, int target) {
        int ans = 0;

        for (int i = 0; i < nums.size(); i++) {

            for (int j = i + 1; j < nums.size(); j++){
                if ((nums.get(i) + nums.get(j)) < target){
                    ans++;
                }
            }
        }
        return ans;
    }

    
}
