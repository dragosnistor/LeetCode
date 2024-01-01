import java.util.HashSet;
import java.util.Set;

public class Solution804 {
    
    public static void main(String[] args) {
        String[] words = new String[]{"gin","zen","gig","msg"};
        int ans = uniqueMorseRepresentations(words);
        System.out.println(ans);
    }
    
    static public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> results = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < words[i].length(); j++) {
                int code = words[i].charAt(j) - 'a';
                sb.append(morse[code]);
            }

            results.add(sb.toString());
        }

        return results.size();
    }

}
