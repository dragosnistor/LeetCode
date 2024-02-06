import java.util.ArrayList;
import java.util.List;

public class Solution2951 {
    
    public static void main(String[] args) {
       int[] mountain = new int[]{1,4,3,8,5};
       List<Integer> ans = findPeaks(mountain);
       System.out.println(ans);
    }

    static public List<Integer> findPeaks(int[] mountain) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i < mountain.length -1; i++){
            if (mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1] ){
                ans.add(i);
            }
        }
        return ans;
    }

}
