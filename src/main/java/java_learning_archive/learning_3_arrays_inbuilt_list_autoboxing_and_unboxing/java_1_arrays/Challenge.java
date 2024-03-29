package java_learning_archive.learning_3_arrays_inbuilt_list_autoboxing_and_unboxing.java_1_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] intArray = getIntegers(5);

        int[] sorted = sortIntegers(intArray);

        printArray(sorted);

//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(values[i]);
//        }
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        // element 0   50
        // element 1   160
        // element 2   40

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
