public class Solution1935 {
    
    public static void main(String[] args) {
        String text = "hello world"; 
        String brokenLetters = "ad";
        int ans = canBeTypedWords(text, brokenLetters);
        System.out.println(ans);
    }

    static public int canBeTypedWords(String text, String brokenLetters) {
        int ans = 0;
        boolean correctWord = true;
        String[] myArray = text.split(" ");

        outer: for (int i = 0; i < myArray.length; i++) {

            inner: for (int j = 0; j < myArray[i].length(); j++) {
                if (brokenLetters.indexOf(myArray[i].charAt(j)) >= 0) {
                    correctWord = false;
                    break inner;
                }
            }
            if (correctWord == true) {
                ans++;
            }
            correctWord = true;
        }
        return ans;
    }

}
