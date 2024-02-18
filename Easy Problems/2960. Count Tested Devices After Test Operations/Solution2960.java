public class Solution2960 {
    
    public static void main(String[] args) {
       int[] batteryPercentages = new int[]{0,1,2};
       int ans = countTestedDevices(batteryPercentages);
       System.out.println(ans);
    }

    static public int countTestedDevices(int[] batteryPercentages) {
        int ans = 0;
        int percentage = 0;

        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] - percentage > 0){
                ans++;
                percentage++;
            }
        }
        return ans;
    }

}
