package java_programming_masterclass.java_learning.archive.Exercises.Exercise_19_Last_Digit_Checker;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println("-------------------------------------------");
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        //Variables
        int lastDigit1 = 0;
        int lastDigit2 = 0;
        int lastDigit3 = 0;

        if ((isValid(num1)) && (isValid(num2))
                && (isValid(num3))) {

            // rightmost digit (last digit of the number)
            lastDigit1 = num1 % 10;
            lastDigit2 = num2 % 10;
            lastDigit3 = num3 % 10;

            if ((lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}
