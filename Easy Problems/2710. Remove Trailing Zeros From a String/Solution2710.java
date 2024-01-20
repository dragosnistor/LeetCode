public class Solution2710 {
    
    public static void main(String[] args) {
        String num = "51230100";
        String ans = removeTrailingZeros2(num);
        System.out.println(ans);
    }

    static public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder(num);

        for (int i = sb.length() - 1; i >= 0; i--){
            if (sb.charAt(i) == '0' ) {
                sb.deleteCharAt(i);
            } else {
                break;
            }
        } 
        return sb.toString();   
    }

    static public String removeTrailingZeros2(String num) {
        int pos = 0;

        for (int i = num.length() - 1; i >= 0; i--){
            if (num.charAt(i) != '0' ) {
                pos = i;
                break;
            }
        }
        return num.substring(0, pos + 1);
    }


}
