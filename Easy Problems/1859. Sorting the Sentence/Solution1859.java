public class Solution1859 {
    
    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        String ans = sortSentence(s);
        System.out.println(ans);
    }

    static public String sortSentence(String s) {
        String[] array = new String[9];
            
        int startIndex = 0;
        int endIndex = 0;
        int wordPosition = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                wordPosition = s.charAt(endIndex - 1) - '0';
                array[wordPosition-1] = s.substring(startIndex, endIndex - 1);
                startIndex = i + 1;
            }
            endIndex++;
        }
        wordPosition = s.charAt(endIndex - 1) - '0';
        array[wordPosition-1] = s.substring(startIndex, endIndex - 1);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            String x = array[i];
            if (x != null) {
                sb.append(x);
                sb.append(' ');
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}
