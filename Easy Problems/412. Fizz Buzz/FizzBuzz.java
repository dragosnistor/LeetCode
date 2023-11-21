import java.util.ArrayList;
import java.util.List;

class FizzBuzz {

    public static void main(String[] args) {
        int n = 11000;
        System.out.println(fizzBuzz(n));
    }

    static public List<String> fizzBuzz(int n) {
        List<String> myArray = new ArrayList<String>();
        
        for (short i = 1; i <= n; i++) {
        StringBuilder myResult = new StringBuilder();    
            
            if (i % 3 == 0) {
                myResult.append("Fizz");
            } 

            if (i % 5 == 0) {
                myResult.append("Buzz");
            } 

            if (myResult.length() == 0) {
                myResult.append(i);
            }

            myArray.add(myResult.toString());

        }
        return myArray;
    }
}