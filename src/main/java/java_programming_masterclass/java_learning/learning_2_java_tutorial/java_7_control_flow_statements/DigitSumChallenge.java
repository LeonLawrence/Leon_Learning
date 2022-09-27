package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_7_control_flow_statements;

public class DigitSumChallenge {

    public static void main(String[] args) {
//        sumDigits(125);
        System.out.println("The sum of digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of digits in number 32123 is " + sumDigits(32123));
    }

    private static int sumDigits1(int number) {
        for (int i = 0; i <= 10; i++) {
            if (number >= 10) {
                System.out.println("Number: " + number);
            }
            number++;
        }
        return -1;
    }


    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 - 12 * 10 = 120 -> 125 -120 = 5

        while (number > 0) {
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least-significant digit
            number /= 10; // same as number = number / 10;
        }
        return sum;
    }
}
