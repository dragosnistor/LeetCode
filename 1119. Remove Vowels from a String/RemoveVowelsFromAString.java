public class RemoveVowelsFromAString {

    public static void main(String[] args){
        String s = "leetcodeisacommunityforcoders";
        String ans = removeVowels(s);
        System.out.println(ans);
    }

    static public String removeVowels(String s) {
        return s.replaceAll("a|e|i|o|u", "");
    }

    
}
