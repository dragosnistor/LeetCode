public class Solution1716 {
    
    public static void main(String[] args) {
        int n = 20;
        int ans = totalMoney2(n);
        System.out.println(ans);
    }

    static public int totalMoney(int n) {
        int additional = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum += additional;
            if (i % 7 == 0) {
                additional-=5;        
            } else {
                additional+=1;
            }
        }
        return sum;
    }


    static public int totalMoney2(int n) {
        int k = n / 7;
        int F = 28;
        int L = 28 + (k - 1) * 7;
        int arithmeticSum = k * (F + L) / 2;

        int monday = 1 + k;
        int finalWeek = 0;
        for (int day = 0; day < n % 7; day++) {
            finalWeek += monday + day;
        }

        return arithmeticSum + finalWeek;
    }

}
