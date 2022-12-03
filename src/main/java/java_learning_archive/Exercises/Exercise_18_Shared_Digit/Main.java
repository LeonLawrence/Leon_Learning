package java_learning_archive.Exercises.Exercise_18_Shared_Digit;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        // Variables
        int lastDigit1 = 0; // last digit of first number
        int lastDigit2 = 0; // last digit of second number
        int value = number2; // original

        // Range
        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {

            while (number1 > 0) {
                lastDigit1 = number1 % 10;
                System.out.println("Number 1 last digit: " + lastDigit1);


                do {

                    lastDigit2 = number2 % 10;
                    System.out.println("Number 2 last digit: " + lastDigit2);

                    if (lastDigit1 == lastDigit2) {
                        return true;
                    } else {
                        number2 /= 10;
                    }
                } while (number2 > 0);

                number2 = value;
                number1 /= 10;
            }
        }
        return false;
    }
}
