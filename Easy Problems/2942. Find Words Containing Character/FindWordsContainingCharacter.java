import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    
    public static void main(String[] args){
        String[] words = new String[]{"abc","bcd","aaaa","cbc"};
        char x = 'a';
        List<Integer> ans = findWordsContaining(words, x);
        System.out.println(ans);
    }

    static public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++){
            String word = words[i];

            if (word.indexOf(x) > -1){
                ans.add(i);
            }
        }
        return ans;
    }

}
