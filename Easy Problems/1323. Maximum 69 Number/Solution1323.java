public class Solution1323 {
    
    public static void main(String[] args) {
        int num = 6669;
        int ans = maximum69Number(num);
        System.out.println(ans);
    }

    static public int maximum69Number2 (int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        boolean change = true;

        for (int i = 0; i < sb.length(); i++) {
            int myNumber = sb.charAt(i) - '0';

            if (change == true && myNumber == 6) {
                sb.setCharAt(i, '9');
                change = false;
            }
        }
        return Integer.valueOf(sb.toString());
    }


    static public int maximum69Number (int num) {
        int numCopy = num;
        int indexSix = -1;
        int currentDigit = 0;

        while (numCopy > 0) {
            if (numCopy % 10 == 6) {
                indexSix = currentDigit;
            }

            numCopy /= 10;
            currentDigit++;
        }

        return indexSix == -1 ? num : num + 3 * (int) Math.pow(10, indexSix);
    }

}
