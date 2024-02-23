public class Solution1266 {
    
    public static void main(String[] args) {
        int[][] points = new int[][]{{3,2},{-2,2}};
        int ans = minTimeToVisitAllPoints2(points);
        System.out.println(ans);
    }

    static public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;

        for (int i = 1; i < points.length; i++){
            ans += Math.max(Math.abs(points[i][0] - points[i-1][0]), Math.abs(points[i][1] - points[i-1][1]));
        }
        return ans;
    }


    static public int minTimeToVisitAllPoints2(int[][] points) {
        int ans = 0;

        for (int i = 1; i < points.length; i++){
            ans += minDist(points[i], points[i-1]);
        }
        return ans;
    }

    static private int minDist(int[] a, int[] b){
        int x = Math.abs(a[0] - b[0]);
        int y = Math.abs(a[1] - b[1]) ;
        
        return  Math.max(x, y);
    }


}
