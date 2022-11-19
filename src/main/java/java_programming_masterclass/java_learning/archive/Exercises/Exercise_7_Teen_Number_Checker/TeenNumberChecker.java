package java_programming_masterclass.java_learning.archive.Exercises.Exercise_7_Teen_Number_Checker;

public class TeenNumberChecker {

    private boolean hasTeen(int number1, int number2, int number3) {
        if (number1 >= 13 && number1 <= 19 ||
                number2 >= 13 && number2 <= 19 ||
                number3 >= 13 && number3 <= 19) {
            return true;
        }
        return false;
    }

    public void printHasTeenMethod(int number1, int number2, int number3) {
        boolean ans = hasTeen(number1, number2, number3);
        System.out.println("Print out: " + ans);
    }
}
