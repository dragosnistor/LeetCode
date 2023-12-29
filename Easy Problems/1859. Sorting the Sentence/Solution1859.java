public class Solution1859 {
    
    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        String ans = sortSentence(s);
        System.out.println(ans);
    }

    static public String sortSentence2(String s) {
        int spaceCounter = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                spaceCounter++;
            }
        }

        String[] array = new String[spaceCounter];
            
        int startIndex = 0;
        int endIndex = 0;
        int wordPosition = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // '0' = 30, '1' = 31, ... '9' = '39'
            if (c >= '0' && c <= '9') {
                wordPosition = s.charAt(endIndex) - '0';
                array[wordPosition-1] = s.substring(startIndex, endIndex);
                startIndex = i + 2;
            }
            endIndex++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            String x = array[i];

            if (i > 0) {
                sb.append(' ');
            } 

            if (x != null) {
                sb.append(x);
            }            
        }
        return sb.toString();
    }

    static public String sortSentence(String s) {
        String[] initialSplitArray = s.split(" ");
        String[] resultArray = new String[initialSplitArray.length];

        for (int i = 0; i < initialSplitArray.length; i++) {
            int wordLen = initialSplitArray[i].length();
            int wordPosition = initialSplitArray[i].charAt(wordLen - 1) - '0';
            resultArray[wordPosition - 1] =  initialSplitArray[i].substring(0, wordLen - 1);
        }

        return String.join(" ", resultArray);
    }


}
