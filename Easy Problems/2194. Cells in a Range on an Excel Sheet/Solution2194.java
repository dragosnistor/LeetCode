import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2194 {

    public static void main(String[] args) {
        String s = "K1:L2";
        List<String> ans =  cellsInRange(s);
        System.out.println(ans);
    }

    static public List<String> cellsInRange2(String s) {
        int firstCol = s.charAt(0) - 'A';
        int lastCol = s.charAt(3) - 'A';
        int firstRow = s.charAt(1) - '0';
        int lastRow = s.charAt(4) - '0';
        List<String> ans = new ArrayList<>();

        for (int i = firstCol; i <= lastCol; i++) {
            for (int j = firstRow; j <= lastRow; j++) {
                char col = (char) (i + 'A');
                char row = (char) (j + '0');
                StringBuilder sb = new StringBuilder();
                ans.add(sb.append(col).append(row).toString());
            }
        }

        return ans;
    }

    static public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        
        for (char i = s.charAt(0); i <= s.charAt(3); i++) {
            for (char j = s.charAt(1); j <= s.charAt(4); j++) {
                ans.add("" + i + j);
            }
        }

        return ans;
    }


}