package java_programming_masterclass.java_learning.Exercises.Exercise_6_Equal_Sum_Checker;

public class EqualSumChecker {

    private boolean hasEqualSum(int number1, int number2, int number3) {

        if (number1 + number2 == number3) {

            return true;
        }
        return false;
    }

    public void printHasEqualSum(int number1, int number2, int number3) {

        boolean ans = hasEqualSum(number1, number2, number3);
        System.out.println(ans);
    }
}
