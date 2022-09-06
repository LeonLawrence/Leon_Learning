package dsa.data_structures_and_algorithms.dsa_1_sort_algorithms.dsa_10_sorting_arrays_using_the_JDK;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

//        Arrays.sort(intArray);
        Arrays.parallelSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }
}
