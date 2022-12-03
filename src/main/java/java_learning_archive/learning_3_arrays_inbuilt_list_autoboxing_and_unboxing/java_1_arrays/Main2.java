package java_learning_archive.learning_3_arrays_inbuilt_list_autoboxing_and_unboxing.java_1_arrays;

import java.util.Scanner;

public class Main2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = getIntegers(5);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element " + i + ", type value was " + intArray[i]);
        }

        System.out.println("The average is " +getAverage(intArray));
    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
