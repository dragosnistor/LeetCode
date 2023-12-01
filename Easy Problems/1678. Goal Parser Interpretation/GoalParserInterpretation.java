public class GoalParserInterpretation {
    
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        String ans = interpret2(command);
        System.out.println(ans);
    }

    static public String interpret(String command) {
        return command.replace("(al)", "al")
        .replace("()", "o");
    }

    static public String interpret2(String command) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if ( c == 'G') {
                ans.append("G");
                continue;
            } else if(c == '(') {
                char cPlusOne = command.charAt(i+1);
                if (cPlusOne == ')') {
                    ans.append("o");
                    i += 1;
                } else if (cPlusOne == 'a') {
                    ans.append("al");
                    i += 3;
                }                
            }
        }
        return ans.toString();
    }



}
