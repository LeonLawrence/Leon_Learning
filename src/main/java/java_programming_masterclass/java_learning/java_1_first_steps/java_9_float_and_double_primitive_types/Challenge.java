package java_programming_masterclass.java_learning.java_1_first_steps.java_9_float_and_double_primitive_types;

import java.util.Scanner;

public class Challenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number");
        double numberOfPounds = scanner.nextInt();

        double convertedKilograms = (numberOfPounds * 0.45359237d);

        System.out.println("converted kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
