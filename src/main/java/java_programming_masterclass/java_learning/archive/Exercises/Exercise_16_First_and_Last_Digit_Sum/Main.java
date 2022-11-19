package java_programming_masterclass.java_learning.archive.Exercises.Exercise_16_First_and_Last_Digit_Sum;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        // variables
        int firstDigit = number;
        int lastDigit = 0;

        // Last digit
        lastDigit = number % 10;

        // First digit
        while(number >= 10) {
            number /= 10; // number / 10 = ?
        }

        firstDigit = number;

        return firstDigit + lastDigit;

    }
}
