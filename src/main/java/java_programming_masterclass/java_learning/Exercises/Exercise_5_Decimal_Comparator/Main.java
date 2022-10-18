package java_programming_masterclass.java_learning.Exercises.Exercise_5_Decimal_Comparator;

public class Main {
    public static void main(String[] args) {
        DecimalComparator decimalComparator = new DecimalComparator();

        decimalComparator.printFigures(-3.1756, -3.175);
        decimalComparator.printFigures(3.175, 3.176);
        decimalComparator.printFigures(3.0, 3.0);
        decimalComparator.printFigures(-3.123, 3.123);
    }
}
