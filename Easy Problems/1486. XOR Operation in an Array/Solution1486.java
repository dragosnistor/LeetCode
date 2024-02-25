public class Solution1486 {

    public static void main(String[] args) {
        int n = 4;
        int start = 3;
        int ans = xorOperation(n, start);
        System.out.println(ans);
    }
    
    static public int xorOperation(int n, int start) {
        int ans = start;

        for (int i = start + 2; i < start + 2 * n; i += 2) {
            ans ^= i;
        }
        return ans;
    }

}

