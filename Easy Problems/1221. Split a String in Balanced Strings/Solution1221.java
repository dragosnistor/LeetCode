public class Solution1221 {
    
    public static void main(String[] args) {
        String s = "LLLLRRRR";
        int ans = balancedStringSplit(s);
        System.out.println(ans);
    }


    static public int balancedStringSplit(String s) {
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);

          if (c == 'R') {
            sum += 1;
          } else {
            sum += -1;
          }

          if (sum == 0) {
            ans++;
          }

        }
        return ans;
    }

    
}
