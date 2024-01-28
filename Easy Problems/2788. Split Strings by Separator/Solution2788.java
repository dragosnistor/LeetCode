import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2788 {
    
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one.two.three","four.five","six");
        char separator = '.';
        List<String> ans = splitWordsBySeparator2(words, separator);
        System.out.println(ans);
    }

    static public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < words.size(); i++){
            String[] slitS = words.get(i).split("["+separator+"]");

            for (String s : slitS) {
                if (s.length() > 0){
                    ans.add(s);
                }
            }
        }
        return ans;
    }

    static public List<String> splitWordsBySeparator2(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();

        for (String word : words){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c != separator) {
                    sb.append(c);
                } else if (sb.length() > 0) {
                    ans.add(sb.toString());
                    sb.setLength(0);
                }
            }
            if (sb.length() > 0) {
                ans.add(sb.toString());
            }
        }
        return ans;
    }


}
