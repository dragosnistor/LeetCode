public class Solution2119 {

    public static void main(String[] args) {
        int num = 1800;
        boolean ans = isSameAfterReversals(num);
        System.out.println(ans);
    }

    static public boolean isSameAfterReversals(int num) {
        if (num == 0 || num % 10 > 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
