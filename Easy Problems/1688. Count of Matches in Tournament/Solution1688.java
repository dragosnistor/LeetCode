public class Solution1688 {


    public static void main(String[] args) {
        int n = 14;
        int ans = numberOfMatches(n);
        System.out.println(ans);
        int ans2 = numberOfMatches2(n);
        System.out.println(ans2);
    } 

    static public int numberOfMatches2(int n) {
        return n-1;
    }

    static public int numberOfMatches(int n) {
        int ans = 0;

        while (n > 1) {

        if ((n & 1) == 1) {
            n += 1;
            ans -= 1;
        }

            n >>= 1;
            ans += n ;
        }

        return ans;
    }

    
}
