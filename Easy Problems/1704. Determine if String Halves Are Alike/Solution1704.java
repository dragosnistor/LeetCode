import java.util.Set;

public class Solution1704 {

    public static void main(String[] args) {
        String s = "textbook";
        boolean ans = halvesAreAlike3(s);
        System.out.println(ans);
    }

    static public boolean halvesAreAlike(String s) {
        int firstHalf = 0;
        int secondHalf = 0;
        Set<Character> vowels  = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        
        int halfPoint = s.length() / 2;

        for (int i = 0; i < halfPoint; i++) {
            char myFirstHalfChar = s.charAt(i);
            char mySecondHalfChar = s.charAt(halfPoint + i);

            if (vowels.contains(myFirstHalfChar)) {
                firstHalf++;
            }

            if (vowels.contains(mySecondHalfChar)) {
                secondHalf++;
            }
        }
        
        if (firstHalf == secondHalf) {
            return true;
        } else {
            return false;
        }
    }

    static public boolean halvesAreAlike2(String s) {
        int firstHalf = 0;
        int secondHalf = 0;
        String vowels  = "aeiouAEIOU";
        
        int halfPoint = s.length() / 2;

        for (int i = 0; i < halfPoint; i++) {
            char myFirstHalfChar = s.charAt(i);
            char mySecondHalfChar = s.charAt(halfPoint + i);

            if (vowels.indexOf(myFirstHalfChar) != -1) {
                firstHalf++;
            }

            if (vowels.indexOf(mySecondHalfChar) != -1) {
                secondHalf++;
            }
        }
        
        if (firstHalf == secondHalf) {
            return true;
        } else {
            return false;
        }
    }

    static public boolean halvesAreAlike3(String s) {
        int firstHalf = 0;
        int secondHalf = 0;
        
        int halfPoint = s.length() / 2;

        for (int i = 0; i < halfPoint; i++) {
            char myFirstHalfChar = s.charAt(i);
            char mySecondHalfChar = s.charAt(halfPoint + i);

            if (isVowel(myFirstHalfChar)) {
                firstHalf++;
            }

            if (isVowel(mySecondHalfChar)) {
                secondHalf++;
            }
        }
        
        return firstHalf == secondHalf;
    }


    static public boolean isVowel(char c) {
         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    
}
