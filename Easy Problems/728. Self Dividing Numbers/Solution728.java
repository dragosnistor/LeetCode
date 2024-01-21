import java.util.ArrayList;
import java.util.List;

public class Solution728 {

    public static void main(String[] args) {
        int left = 47;
        int right = 85;
        List<Integer> ans = selfDividingNumbers(left, right);
        System.out.println(ans);

    }


    static public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {

            if (selfDividing(i)) {
                ans.add(i);
            }

        }

        return ans;
    }

    static public boolean selfDividing(int i) {
        int copyOfNumber = i;

        while (copyOfNumber > 0) {
            int lastDigit = copyOfNumber % 10;

            if (lastDigit == 0 || (i % lastDigit) > 0) {
                return false;
            }
        
            copyOfNumber /= 10;
        }
        return true;
    }


    static public List<Integer> selfDividingNumbers2(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            boolean include = true;

            for (char c  : String.valueOf(i).toCharArray()) {

                if (c == '0' || (i % (c- '0') > 0)) {
                    include = false;
                    break;
                }
            }

            if (include) {
                ans.add(i);
            }
        }

        return ans;
    }
    
}
