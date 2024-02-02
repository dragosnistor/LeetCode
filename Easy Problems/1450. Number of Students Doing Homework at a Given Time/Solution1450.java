public class Solution1450 {
    
    public static void main(String[] args) {
        int[] startTime = new int[]{1,2,3};
        int[] endTime = new int[]{3,2,7};
        int queryTime = 4;
        int ans = busyStudent(startTime, endTime, queryTime);
        System.out.println(ans);
    }

    static public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int ans = 0;

        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]){
                ans++;
            }
        }
        return ans;
    }

}
