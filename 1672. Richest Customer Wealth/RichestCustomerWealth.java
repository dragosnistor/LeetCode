public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] wealthMatrix = new int[][]{{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(wealthMatrix));
    }
    
    static public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++){
            int thisCustomer = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                thisCustomer += accounts[i][j]; 
            }
            if (thisCustomer > max) {
                max = thisCustomer;
            }
        }
        return max;
    }


}
