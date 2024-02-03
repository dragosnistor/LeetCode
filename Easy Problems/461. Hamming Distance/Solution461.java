public class Solution461 {
    
    public static void main(String[] args) {
        int x = 3;
        int y = 1;
        int ans = hammingDistance2(x, y);
        System.out.println(ans);
    }


    static public int hammingDistance(int x, int y) {
        int ans = 0;
        for (char c : Integer.toBinaryString(x ^ y).toCharArray()) {
            if (c == '1') {
                ans++;
            }
        }
        return ans;
    }

    static public int hammingDistance2(int x, int y) {
        return Integer.bitCount(x ^ y);
    }



}
