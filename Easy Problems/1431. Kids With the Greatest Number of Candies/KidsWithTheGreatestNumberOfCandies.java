import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {
        int[] candies = new int[]{4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> ans = kidsWithCandies(candies, extraCandies);
        System.out.println(ans);
    }

    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> numbers = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max){
                max = candies[i];
            }            
        }

        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= max) {
                numbers.add(true);
            } else {
                numbers.add(false);
            }
        }

        return numbers;
    }

    
}
