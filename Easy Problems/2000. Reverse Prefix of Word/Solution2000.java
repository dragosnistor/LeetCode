public class Solution2000 {

    public static void main(String[] args) {
        String word = "xyxzxe";
        char ch = 'z';
        String ans = reversePrefix(word, ch);
        System.out.println(ans);
    }

    static public String reversePrefix(String word, char ch) {
        boolean found = false;
        StringBuilder mySb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char myChar = word.charAt(i);

            if (myChar == ch && found == false) {
                mySb.append(word.substring(0, i + 1)).reverse();
                found = true;
            }

            if (found == true && word.length() - i > 1) {
                mySb.append(word.substring(i + 1, word.length()));
                break;
            }
        }

        if (mySb.isEmpty()) {
            return word;
        }

        return mySb.toString();
    }
    
}
