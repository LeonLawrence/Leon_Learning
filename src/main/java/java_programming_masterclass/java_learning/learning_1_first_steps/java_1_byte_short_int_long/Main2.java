package java_programming_masterclass.java_learning.learning_1_first_steps.java_1_byte_short_int_long;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("My name is Leon");


        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myTotal);


        // Challenge
        // Create a new variable called myLastOne.
        // We want the value to be 1000 less than the current value of myTotal - the data type is an int

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}