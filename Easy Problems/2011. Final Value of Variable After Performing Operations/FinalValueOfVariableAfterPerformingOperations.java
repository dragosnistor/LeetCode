public class FinalValueOfVariableAfterPerformingOperations {

    public static void main(String[] args){
        String[] operations = new String[]{"--X", "X++", "X++"};
        int ans = finalValueAfterOperations(operations);
        System.out.println(ans);

    }

    static public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.contains("+")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
    
}
