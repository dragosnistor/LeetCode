public class Solution3019 {
    
    public static void main(String[] args) {
        String s = "mDVD";
        int ans = countKeyChanges(s);
        System.out.println(ans);
    }

    static public int countKeyChanges(String s) {
        int ans = 0;

        for (int i = 1; i < s.length(); i++) {
            int diff = Math.abs(s.charAt(i) - s.charAt(i - 1));
            if (diff != 0 && diff != 32) {
                ans++;
            }
        }
        return ans;
    }

}
