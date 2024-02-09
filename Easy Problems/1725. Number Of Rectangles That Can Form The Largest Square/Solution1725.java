import java.util.HashMap;
import java.util.Map;

public class Solution1725 {
    
    public static void main(String[] args) {
        int[][] rectangles = new int[][]{{2,3},{3,7},{4,3},{3,7}};
        int ans = countGoodRectangles3(rectangles);
        System.out.println(ans);
    }

    static public int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < rectangles.length; i++) {
            int min = Math.min(rectangles[i][0], rectangles[i][1]);
            int count = myMap.getOrDefault(min, 0);
            myMap.put(min, count + 1);
            if (min > max) {
                max = min;
            }
        }

        return myMap.get(max);
    }

    static public int countGoodRectangles2(int[][] rectangles) {
        int max = 0;
        int[] myArray = new int[rectangles.length];

        for (int i = 0; i < rectangles.length; i++) {
            int min = Math.min(rectangles[i][0], rectangles[i][1]);
            myArray[i] = min;
            if (min > max) {
                max = min;
            }
        }

        int ans = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == max) {
                ans++;
            }
        }
        return ans;
    }

    static public int countGoodRectangles3(int[][] rectangles) {
        int max = 0;
        int ans = 0;

        int[] myArray = new int[rectangles.length];

        for (int i = 0; i < rectangles.length; i++) {
            int min = Math.min(rectangles[i][0], rectangles[i][1]);
            myArray[i] = min;
            if (min > max) {
                ans = 1;
                max = min;
            } else if (min == max){
                ans++;
            }
        }
        return ans;
    }

}
