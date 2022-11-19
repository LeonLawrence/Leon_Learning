package java_programming_masterclass.java_learning.archive.learning_3_arrays_inbuilt_list_autoboxing_and_unboxing.java_1_arrays;

public class Main {
    public static void main(String[] args) {
//        int[] intArray = new int[10];

        int[] intArray = new int[25]; //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 10;
        }

//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println("Element " + i + ", value");
//        }
        printArray(intArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length;i++) {
            System.out.println("Element " + i + ", value");
        }
    }
}
