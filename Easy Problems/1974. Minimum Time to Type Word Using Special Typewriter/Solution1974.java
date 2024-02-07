public class Solution1974 {
    
    public static void main(String[] args) {
        String word = "zjpc";
        int ans = minTimeToType(word);
        System.out.println(ans);
    }

    static public int minTimeToType(String word) {
        int ans = 0;
        int position = 0;
        for (char c : word.toCharArray()){
            int letter = c - 'a';

            int oneWay = Math.abs(letter - position);
            int reverse = Math.abs(26 - oneWay);

            int diff = Math.min(oneWay, reverse);
            ans += diff + 1;
            position = letter;
        }
        return ans;
    }

}
