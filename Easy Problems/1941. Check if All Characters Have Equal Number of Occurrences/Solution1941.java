public class Solution1941 {
    
    public static void main(String[] args) {
        String s = "aaabb";
        boolean ans = areOccurrencesEqual(s);
        System.out.println(ans);
    }

    public boolean areOccurrencesEqual(String s) {
        boolean ans = true;
        int[] myCharArray = new int[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a';
            myCharArray[x] = myCharArray[x] + 1;
            count = myCharArray[x];
        }

        for (int j = 0; j < myCharArray.length; j++) {
            if (myCharArray[j] > 0 && myCharArray[j] != count) {
                return false;
            }
        }
        return ans;
    }

    static public boolean areOccurrencesEqual2(String s) {
        boolean ans = true;
        int[] myCharArray = new int[26];

        for (char c: s.toCharArray()) {
            int x = c - 'a';
            myCharArray[x] = myCharArray[x] + 1;
        }

        int count = myCharArray[s.charAt(0) - 'a'];


        for (int j = 0; j < myCharArray.length; j++) {
            if (myCharArray[j] > 0 && myCharArray[j] != count) {
                return false;
            }
        }
        return ans;
    }

}
