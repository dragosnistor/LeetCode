public class Solution1614 {
    
    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        int ans = maxDepth(s);
        System.out.println(ans);
    }

    static public int maxDepth(String s) {
        int count = 0;
        int max = 0;

        if (s.length() < 2) {
            return 0;
        }

        for (char c : s.toCharArray()){
            if (c == '(') {
                count++;
                max = Math.max(count, max);
            } else if (c == ')') {
                count--;
            }
        }
        return max;
    }

}
