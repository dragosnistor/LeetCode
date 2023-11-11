public class NumberOfStepsToReduceANumbertoZero {
 
    public static void main(String[] args) {
        int myNumber = 14;
        System.out.println(numberOfSteps(14));
    }

    // static public int numberOfSteps(int num) {
        // int answer = Integer.parseInt(Integer.toBinaryString(num));
        // return answer;
    // }

    static public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
                steps++;
        }
        return steps;
    }

}
