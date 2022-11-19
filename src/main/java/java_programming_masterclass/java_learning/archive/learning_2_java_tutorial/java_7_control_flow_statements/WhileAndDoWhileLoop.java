package java_programming_masterclass.java_learning.archive.learning_2_java_tutorial.java_7_control_flow_statements;

public class WhileAndDoWhileLoop {
    public static void main(String[] args) {

        int count = 6;

        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        // FOR LOOP BELOW IS NOT IDENTICAL TO THE ABOVE WHILE LOOP
//        for (int i = 1; i < 7; i++) {
//            System.out.println("Count value is " + i);
//        }

        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        System.out.println("----------------------------------------------------");

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("----------------------------------------------------");
        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);


        System.out.println("----------------------------------------------------");

        // Create a method called isEvenNumber that takes a parameter of type int
        // It's purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false;

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        System.out.println("ODD == FALSE");
        System.out.println("EVEN == TRUE");
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
//                continue;
            System.out.println("Even Number " + number + " " + isEvenNumber(number));
            } else if(isEvenNumber((number))) {
            System.out.println("Odd Number " + number + " " + isEvenNumber(number));

            }

        }

        System.out.println("----------------------------------------------------");

        number = 4;
        finishNumber = 20;
        evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            if (evenNumbersFound != 6) {
                break;
            }
                evenNumbersFound++;
            System.out.println("Odd number: " + number);
                System.out.println("Even Number: " + number + " " + isEvenNumber(number));
        }
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
