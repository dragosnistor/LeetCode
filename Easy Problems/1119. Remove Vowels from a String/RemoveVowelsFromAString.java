public class RemoveVowelsFromAString {

    public static void main(String[] args){
        String s = "leetcodeisacommunityforcoders";
        String ans = removeVowels(s);
        System.out.println(ans);
    }

    // static public String removeVowels(String s) {
    //     return s.replaceAll("a|e|i|o|u", "");
    // }

    static public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c !='a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' ) {
              sb.append(c);                  
            }
        }
            return sb.toString();
    }
}
