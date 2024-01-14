public class Solution1309 {
    
    public static void main(String[] args) {
        String s = "1";
        String ans = freqAlphabets(s);
        System.out.println(ans);
    }

    static public String freqAlphabets(String s) {
        int pos = s.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (pos >= 0) {
            char c = s.charAt(pos);
            
            if (c == '#') {
                int n = Integer.valueOf(s.substring(pos - 2,pos));
                char add = (char) ('a' + n - 1);
                sb.append(add);
                pos -= 3;
            } else {
                int n = (int) (s.charAt(pos) - '0');
                char add = (char) ('a' + n - 1);
                sb.append(add);
                pos -= 1; 
            }

        }
        
        return sb.reverse().toString();
    }
}
