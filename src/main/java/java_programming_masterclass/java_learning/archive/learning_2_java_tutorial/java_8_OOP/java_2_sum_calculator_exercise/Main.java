package java_programming_masterclass.java_learning.archive.learning_2_java_tutorial.java_8_OOP.java_2_sum_calculator_exercise;

import java.util.Scanner;

public class Main {

    private Scanner scanner = new Scanner(System.in);
    private SimpleCalculator simpleCalculator = new SimpleCalculator();
    private static Main main = new Main();

    public static void main(String[] args) {
        main.setScanner();

    }

    public void setScanner() {
        System.out.println("Enter First Number");
        simpleCalculator.setFirstNumber(scanner.nextDouble());

        System.out.println("Enter Second Number");
        simpleCalculator.setSecondNumber(scanner.nextDouble());

        scanner.close();

        System.out.println("Addition: " + simpleCalculator.getAdditionResult());
        System.out.println("Subtraction: " + simpleCalculator.getSubtractionResult());
        System.out.println("Multiplication: " + simpleCalculator.getMultiplicationResult());
        System.out.println("Division: " + simpleCalculator.getDivisionResult());
    }
}