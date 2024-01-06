public class Solution2315 {


    public static void main(String[] args) {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        int ans = countAsterisks(s);
        System.out.println(ans);
    }

    static public int countAsterisks(String s) {
        int ans = 0;
        boolean inBetweenParan = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '*' && inBetweenParan == false) {
                ans++;
            } 

            if (c == '|') {
                inBetweenParan  = !inBetweenParan;
            }
        }
        return ans;
    }

}
