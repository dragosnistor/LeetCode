public class SmallestEvenMultiple {
    
    public static void main(String[] args) {
        int n = 5;
        int ans = smallestEvenMultiple(n);
        System.out.println(ans);
    }

    static public int smallestEvenMultiple(int n) {
        int ans = n;

        if (n % 2 > 0) {
            ans = n * 2;
        }

        return ans;
    }


}
