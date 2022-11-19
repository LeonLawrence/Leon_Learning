package java_programming_masterclass.java_learning.archive.Exercises.Exercise_5_Decimal_Comparator;

public class DecimalComparator {

    private int num1;
    private int num2;

   private boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        // Type Casting (Double to Integer)
       num1 = (int) (number1 * 1000);
       num2 = (int) (number2 * 1000);

        if (num1 == num2) {
            return true;
        }
        return false;
    }

    public void printFigures(double num1, double num2) {
        boolean sum = areEqualByThreeDecimalPlaces(num1, num2);
        System.out.println(num1 + " == " + num2 + " = " + sum);
    }
}
