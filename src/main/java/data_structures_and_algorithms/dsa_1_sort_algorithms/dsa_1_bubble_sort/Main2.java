package data_structures_and_algorithms.dsa_1_sort_algorithms.dsa_1_bubble_sort;

public class Main2 {

        private static int[] intArray = {9, 1, 8, 2, 7, 3, 6, 4, 5};

    public static void main(String[] args) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap (intArray, i, i + 1);
                }
            }
        }
        printCommandUsingForEachLoop();
//        printCommandUsingForLoop();
    }

    private static void printCommandUsingForLoop() {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void printCommandUsingForEachLoop() {
        for (int printing : intArray) {
            System.out.println(printing);
        }
    }

    private static void swap(int[] array, int i, int j) {

        if (i ==j) {
        return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
