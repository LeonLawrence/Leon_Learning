package java_programming_masterclass.java_learning.learning_3_arrays_inbuilt_list_autoboxing_and_unboxing.java_3_minimum_element_challange;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnArray = readIntegers(count);
        int returnedMin = findMin(returnArray);

        System.out.println("min = " + returnedMin);

    }

    private static int[] readIntegers(int count) {
        int[] intArray = new int[count];

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            intArray[i] = number;
        }
        return intArray;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}