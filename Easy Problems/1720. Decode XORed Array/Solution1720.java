public class Solution1720 {
    
    public static void main(String[] args) {
        int[] encoded =  new int[]{6,2,7,3};
        int first = 4;
        int[] ans = decode(encoded, first);
        System.out.println(ans);
    }

    static public int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length + 1];
        ans[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            ans[i + 1] = encoded[i] ^ ans[i]; 
        }

        return ans;
    }
}