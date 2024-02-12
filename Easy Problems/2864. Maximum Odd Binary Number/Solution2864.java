public class Solution2864 {
    
    public static void main(String[] args) {
        String s = "0101";
        String ans = maximumOddBinaryNumber(s);
        System.out.println(ans);
    }

    static public String maximumOddBinaryNumber(String s) {
        int len = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                len++;
            }
        }
        // int num = Integer.parseInt(s, 2);
        // int len = Integer.bitCount(num);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < len - 1; i++){
            sb.append('1');
        }

        for (int i = len - 1; i < s.length() - 1; i++){
            sb.append('0');
        }

        sb.append('1');

        return sb.toString();
    }

}
