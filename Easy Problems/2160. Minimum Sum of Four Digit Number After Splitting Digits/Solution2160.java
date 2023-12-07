import java.util.Arrays;

public class Solution2160 {
    
    public static void main(String[] args) {
        int num = 2932;
        int ans = minimumSum(num);
        System.out.println(ans);
    }

    static public int minimumSum(int num) {
        int nb1 = 0;
        int nb2 = 0;
        int len = 4;
        int[] z = new int[len];

        for (int i = 0; i < len; i++) {
            int lastDigit = num % 10;
            z[i] = lastDigit;
            num = num / 10;
        }

        Arrays.sort(z);

        nb1 = z[0] * 10 + z[2];
        nb2 = z[1] * 10 + z[3];
        
        return nb1 + nb2;
    }

}
