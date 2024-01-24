public class Solution1351 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{4,3,2,-1},
                                   {3,2,1,-1},
                                   {1,1,-1,-2},
                                   {-1,-1,-2,-3}};
        int[][] grid2 = new int[][]{{3,2},
                                    {1,0}};
        int ans = countNegatives(grid2);
        System.out.println(ans);
    }

    static public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;

        for (int i = m - 1; i > -1;i--) {
            for (int j = n - 1; j > -1; j--) {
                if (grid[i][j] < 0) {
                    ans ++;
                } else {
                    break;
                }
            }
        }
        return ans;
    }

}
