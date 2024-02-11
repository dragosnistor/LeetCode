public class Solution338 {
    

    public static void main(String[] args) {
        int n = 5;
        int[] ans = countBits(n);
        System.out.println(ans);
    }

    static public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ans[i] = Integer.bitCount(i);
        }
        return ans;
    }

}
