public class Solution2485 {

    public static void main(String[] args) {
        int n = 8;
        int ans = pivotInteger4(n);
        System.out.println(ans);
    }

    static public int pivotInteger(int n) {
        int[] increasing = new int[n];
        int[] decresing = new int[n];
        int sumIncreasing = 0;
        int sumDecreasing = 0;
        int ans = -1;

        for (int i = 1; i <= n; i++){
            sumIncreasing += i;
            increasing[i - 1] = sumIncreasing;
            sumDecreasing += n + 1 - i;
            decresing[n - i] = sumDecreasing;
            if (increasing[i - 1] == decresing[i - 1] && increasing[i - 1] != 0) {
                return i;
            }
        }   
        return ans;
    }

    static public int pivotInteger2(int n) {
        int leftSum = 0;
        int sum = n * (n + 1 ) / 2;
        int rightSum = sum;

        for (int i = 1; i <= n; i++){
            leftSum += i;
            rightSum -= i - 1;
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
    

    static public int pivotInteger3(int n) {
        int k = n * (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            if (i * i == k) return i;
        }

        return -1;
    }

    static public int pivotInteger4(int n) {
        double x = Math.sqrt(n * (n + 1) / 2);
        return x % 1 == 0 ? (int) x : -1; // check if x is an int
    }
    
}
