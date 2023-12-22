public class Solution2325 {
    
    public static void main(String[] arg) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String ans = decodeMessage(key, message);
        System.out.println(ans);
    }

    static public String decodeMessage(String key, String message) {
        StringBuilder sbMyKey = new StringBuilder();

        for (char c : key.toCharArray()) {
            if (c == ' ') {
                continue;
            }

            if (sbMyKey.indexOf("" + c) == -1) {
                sbMyKey.append(c);
            }
        }
        
        StringBuilder sbDecoded = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (c == ' ') {
                sbDecoded.append(' ');
                continue;
            }

            char decoded = (char) (sbMyKey.indexOf("" + c) + 'a');
            sbDecoded.append(decoded);
        }
        return sbDecoded.toString();
    }

}
