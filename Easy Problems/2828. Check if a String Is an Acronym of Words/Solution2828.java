import java.util.ArrayList;
import java.util.List;

public class Solution2828 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("never","gonna","give","up","on","you"));
        String s = "ngguoy";
        boolean ans = isAcronym(words, s);
        System.out.println(ans);
    }

    static public boolean isAcronym2(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    static public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i).charAt(0));
        }

        return sb.toString().equals(s);
    }
    
}
