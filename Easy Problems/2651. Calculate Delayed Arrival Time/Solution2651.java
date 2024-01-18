public class Solution2651 {
    
    public static void main(String[] args) {
        int arrivalTime = 13;
        int delayedTime = 11;
        int ans = findDelayedArrivalTime(arrivalTime, delayedTime);
        System.out.println(ans);
    }

    static public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int ans = arrivalTime + delayedTime;
        return ans >= 24 ? ans - 24 : ans;
    }

    static public int findDelayedArrivalTime2(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }


}
