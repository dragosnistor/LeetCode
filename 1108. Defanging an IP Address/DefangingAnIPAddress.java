public class DefangingAnIPAddress {

    public static void main(String[] args) {
        String input = "1.1.1.1";
        String ans = defangIPaddr(input);
        System.out.println(ans);
    }

    static public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < address.length(); i++){
            char c = address.charAt(i);
            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    
}
