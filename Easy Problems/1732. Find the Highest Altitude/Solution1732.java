public class Solution1732 {
       
    public static void main(String[] args) {
        int[] gains = new int[]{-5,1,5,0,-7};
        int ans = largestAltitude(gains);
        System.out.println(ans);
    }

   static public int largestAltitude(int[] gain) {
        int sum = 0; 
        int max = 0;

        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];

            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

}
