package java_programming_masterclass.java_learning.Exercises.Exercise_15_Number_Palindrome;

public class Palindrome {

    public boolean isPalindrome(int number) {


        // Variables
        int lastDigit = 0; // Store value of last digit
        int reverse = 0; // Store reverse number of given value
        int value = number; // Stores value given to us

        while (number != 0 || number > 0) {
            lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit; // += means reverse + last digit
            number /= 10;
        }

        if (value == reverse) {
            return true;
        }
        return false;
    }
}
