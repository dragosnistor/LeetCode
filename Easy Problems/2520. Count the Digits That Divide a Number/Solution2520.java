public class Solution2520 {
    
    public static void main(String[] args) {
        int num = 1248;
        int ans = countDigits(num);
        System.out.println(ans);
    }

    static public int countDigits(int num) {
        int ans = 0;
        int myNum = num;

        while (myNum != 0) {
            int digit = myNum % 10;

            if (num % digit == 0) {
                ans++;
            }   

            myNum /= 10;
        }


        return ans;
    }

}
