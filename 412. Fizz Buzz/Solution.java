import java.util.List;

class Solution {

    public static void main(String[] args) {
        int n = 11000;
        System.out.println(fizzBuzz(n));
    }

    static public List<String> fizzBuzz(int n) {
        String[] myArray = new String[n];
        
        for (short i = 1; i <= n; i++) {
        String myResult = "";    
            
            if (i % 3 == 0) {
                myResult += "Fizz";
            } 

            if (i % 5 == 0) {
                myResult += "Buzz";
            } 

            if (myResult.length() == 0) {
                myResult = ""+i;
            }

            myArray[i-1] = myResult;

        }
        return List.of(myArray);
    }
}