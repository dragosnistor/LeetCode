public class Solution2678 {
    
    public static void main(String[] args) {
        String[] details = new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"};
        int ans = countSeniors(details);
        System.out.println(ans);
    }

    static public int countSeniors(String[] details) {
        int ans = 0;

        for (int i = 0; i < details.length; i++){
            int age = (details[i].charAt(11) - '0') * 10 + (details[i].charAt(12) - '0');

            if (age > 60) {
                ans++;
            }
        }
        return ans; 
    }

    static public int countSeniors2(String[] details) {
        int ans = 0;

        for (int i = 0; i < details.length; i++){
            int age = Integer.parseInt(details[i].substring(11, 13));

            if (age > 60) {
                ans++;
            }
        }
        return ans; 
    }



}
