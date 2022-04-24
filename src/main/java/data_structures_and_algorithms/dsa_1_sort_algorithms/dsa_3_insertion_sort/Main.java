package data_structures_and_algorithms.dsa_1_sort_algorithms.dsa_3_insertion_sort;

public class Main {
    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

            int newElement = intArray[firstUnsortedIndex];

            int i;

            // loop that does the traversal of the sorted partition and looks for the correct partition
            for (i = firstUnsortedIndex; i  > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}