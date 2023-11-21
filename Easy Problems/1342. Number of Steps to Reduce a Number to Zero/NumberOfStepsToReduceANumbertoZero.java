public class NumberOfStepsToReduceANumbertoZero {
 
    public static void main(String[] args) {
        int myNumber = 14;
        System.out.println(numberOfSteps(14));
    }

    static public int numberOfSteps(int num) {
        int steps = 0;
        int answer;

        while (num > 0) {
            answer = Integer.parseInt(Integer.toBinaryString(num));
            // Before we used % 2
            if ((num & 1) == 0) { // num: xxxxxxx0 & bitmask 00000001
                // Before we used num /= 2
                num >>= 1;
            } else {
                num--;
            }
                steps++;
        }
        return steps;
    }

    // static public int numberOfSteps(int num) {
    //     int steps = 0;

    //     while (num > 0) {
    //         if (num % 2 == 0) {
    //             num /= 2;
    //         } else {
    //             num--;
    //         }
    //             steps++;
    //     }
    //     return steps;
    // }

}
