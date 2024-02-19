public class Solution3023 {

    public static void main(String[] args) {
        int a = 80; 
        int b = 120;
        int ans = numberCount(a, b);
        System.out.println(ans);
    }

    static public int numberCount(int a, int b) {
        int ans = 0;

        for (int i = a; i <= b; i++){
            if (i <= 10) {
                ans++;
            } else if (i <= 99) {
                if (i / 10 != i % 10) {
                    ans++;
                }
            } else if (i < 1000) {
                int first = i / 100;
                int second = i % 100 / 10 ;
                int third = i % 10;
                if (first != second && second != third && first != third) {
                    ans++;
                }
            }
        }
        return ans;
    }


}