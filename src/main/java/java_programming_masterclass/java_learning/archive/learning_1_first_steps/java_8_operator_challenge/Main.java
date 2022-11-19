package java_programming_masterclass.java_learning.archive.learning_1_first_steps.java_8_operator_challenge;

public class Main {
    public static void main(String[] args) {

        double myFirstValue = 20.00;
        double mySecondValue = 80.00;

        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("MyValueTotal = " + myValuesTotal);
        System.out.println("theRemainder = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + theRemainder);

        if (!isNoRemainder) {
            System.out.println("Got Some Remainder");
        }

    }
}
