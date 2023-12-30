public class Solution557 {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);
    }

    static public String reverseWords2(String s) {
        String[] split = s.split(" ");
        String[] reverse = new String[split.length];

        for (int i = 0; i < split.length; i++) {
            int index = split[i].length();
            StringBuilder sb = new StringBuilder();

            for (int j = index - 1; j >= 0; j--) {
                sb.append(split[i].charAt(j));
            }

            reverse[i] = sb.toString();
        }
        return String.join(" ", reverse);
    }

    static public String reverseWords3(String s) {
        String[] split = s.split(" ");
        String[] reverse = new String[split.length];

        for (int i = 0; i < split.length; i++) {
            StringBuilder sb = new StringBuilder(split[i]);
            sb.reverse();
            reverse[i] = sb.toString();
        }
        return String.join(" ", reverse);
    }


    static public String reverseWords4(String s) {
        String[] split = s.split(" ");
        StringBuilder reverse = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            StringBuilder sb = new StringBuilder(split[i]);
            sb.reverse();
            reverse.append(sb).append(" ");
        }
        return reverse.toString().trim();
    }


    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = 0;
        for (;j<c.length;j++) {
            if (c[j] == ' ') {
                reverseWord(c, i, j-1);
                i = j+1;
            } 
        }
        reverseWord(c, i, j-1);
        return new String(c);
    }
    
    private void reverseWord(char[] c, int i, int j) {
        while (i < j) {
            char temp = c[i];
            c[i++] = c[j];
            c[j--] = temp;
        }
    }
    
}
