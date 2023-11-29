public class SmallestEvenMultiple {
    
    public static void main(String[] args) {
        int n = 5;
        int ans = smallestEvenMultiple(n);
        System.out.println(ans);
    }

    static public int smallestEvenMultiple(int n) {
        return n << (n & 1);
    }


}
