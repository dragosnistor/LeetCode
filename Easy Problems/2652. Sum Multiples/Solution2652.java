public class Solution2652 {

    public static void main(String[] args) {
        int n = 7;
        int ans = sumOfMultiples(n);
        System.out.println(ans);
    }

    static public int sumOfMultiples(int n) {
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            if ( i % 3 == 0 || i % 5 == 0 || i % 7 == 0 ) {
                ans += i;
            } 
        }
        return ans;
    }

}