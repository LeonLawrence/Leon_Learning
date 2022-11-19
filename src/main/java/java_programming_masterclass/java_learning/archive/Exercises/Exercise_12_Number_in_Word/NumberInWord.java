package java_programming_masterclass.java_learning.archive.Exercises.Exercise_12_Number_in_Word;

public class NumberInWord {


    public static void printNumberInWord(int number) {

        switch (number) {

            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");

        }

    }
}
