package java_programming_masterclass.java_learning.Exercises.Exercise_10_Equality_Printer;

import static java_programming_masterclass.java_learning.Exercises.Exercise_10_Equality_Printer.EqualityPrinter.printEqual;

public class Main {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);

    }
}
