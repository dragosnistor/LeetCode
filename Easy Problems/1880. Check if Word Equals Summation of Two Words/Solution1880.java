public class Solution1880 {
    
    public static void main(String[] args) {
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";
        boolean ans = isSumEqual(firstWord, secondWord, targetWord);
        System.out.println(ans);
    }

    static public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        if (returnNum(firstWord) + returnNum(secondWord) != returnNum(targetWord)){
            return false;
        }
        return true;
    }

    static public int returnNum(String myString){
        int len = myString.length() - 1;
        int ans = 0;

        for (char c : myString.toCharArray()) {
            int x = c - 'a';
            ans +=  (int) (x * Math.pow(10, len));
            len--;
        }
        return ans;
    }

}
