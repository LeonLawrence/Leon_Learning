package java_programming_masterclass.java_learning.exercises.java_2_expressions_statements_code_blocks_methods_and_more.exercise_0_positive_negative_or_zero;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean trigger = false;

    public static void main(String[] args) {

        while(trigger != true) {
            System.out.println("Please enter a number");
            checkNumber(scanner.nextInt());
        }
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        }
        if (number < 0) {
            System.out.println("negative");
        }
        if (number == 0) {
            System.out.println("zero");
            trigger = true;

        }
    }
}
