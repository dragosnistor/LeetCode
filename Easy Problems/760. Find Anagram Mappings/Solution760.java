import java.util.LinkedHashMap;
import java.util.Map;

public class Solution760 {
    
    public static void main(String[] args) {
        int[] nums1 = new int[]{12,28,46,32,50};
        int[] nums2 = new int[]{50,12,32,46,28};
        int[] ans = anagramMappings(nums1, nums2);
        System.out.println(ans);
    }

    static public int[] anagramMappings2(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int number1 = nums1[i];

            for (int j = 0; j < nums2.length; j++) {
                int number2 = nums2[j];

                if (number1 == number2) {
                    ans[i] = j;
                    break;
                }
            }
            
        }
        return ans;
    }

    static public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Map<Integer, Integer> nums2Map = new LinkedHashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            nums2Map.put(nums2[i], i);
        }

        for (int j = 0; j < nums1.length; j++) {
            ans[j] = nums2Map.get(nums1[j]);
        }
            
        return ans;
    }

}
