public class Solution1281 {

    public static void main(String[] args) {
        int n = 234;
        int ans = subtractProductAndSum(n);
        System.out.println(ans);
    }

    // String
    // Time complexity: O(n)
    // Space complexity: O(n)
    static public int subtractProductAndSum2(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        int product = 1;

        for (char c : s.toCharArray()) {
            sum += c - '0';
            product *= c - '0';
        }

        return product - sum;
    }

    // Modulo
    // Time complexity: O(n)
    // Space complexity: O(1)
    static public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while (n != 0) {
            int lastDigit = n % 10;
            product *= lastDigit;
            sum += lastDigit;
            n = n / 10;
        }

        return product - sum;
    }
}
