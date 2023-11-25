import java.util.HashMap;

public class JewelsAndStones {

    public static void main(String[] args){
        String jewels = "aA";
        String stones = "aAAbbbb";
        int ans = numJewelsInStones(jewels, stones);
        System.out.println(ans);
    }

    static public int numJewelsInStones(String jewels, String stones) {
        // Map<String, Integer> myMap = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < stones.length(); i++){
            String c = String.valueOf(stones.charAt(i));
            if (jewels.contains(c)){
                ans++;
            }
        }
        return ans;
    }

    
}
