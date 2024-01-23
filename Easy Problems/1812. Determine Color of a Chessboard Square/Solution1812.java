public class Solution1812 {
    
    public static void main(String[] args) {
        String coordinates = "g8";
        boolean ans = squareIsWhite(coordinates);
        System.out.println(ans);
    }
    
    static public boolean squareIsWhite(String coordinates) {
        int letter = coordinates.charAt(0) - 'a' + 1;
        int number = coordinates.charAt(1) - '0';

        return (letter + number) % 2 == 0 ? false : true;
    }

    static public boolean squareIsWhite2(String coordinates) {
        return ((coordinates.charAt(0) - 'a') + (coordinates.charAt(1) - '0')) % 2 == 0;    
    }
}