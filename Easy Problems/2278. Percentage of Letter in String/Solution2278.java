public class Solution2278 {
    
    public static void main(String[] args) {
        String s = "jjjj";
        char letter = 'k';
        int ans = percentageLetter(s, letter);
        System.out.println(ans);
    }

    static public int percentageLetter(String s, char letter) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }
        return (int) (100.0 * count / s.length());
    }

}
