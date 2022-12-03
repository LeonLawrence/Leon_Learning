package java_learning_archive.Exercises.Exercise_17_Even_Digit_Sum;

public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        // invalid option
        if (number < 0) {
            return -1;
        }

        // variables
        int sum = 0;
        int lastDigit = 0;

        // calculations
        while(number > 0) {
            lastDigit = number % 10;

            // check if number is even;
            if (number % 2 == 0) { //if divisible by two and the remainder == 0 then it is even
                sum += lastDigit; //sum + lastDigit - sum;
                number /= 10; // number  10 - number
            } else { // check if number is odd
                number /= 10;
                continue;
            }
        }

        // output
        return sum;
    }
}
