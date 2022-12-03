package java_learning_archive.java_1_first_steps.java_14_operator_precedence_and_operator_challenge;

public class Main {
    public static void main(String[] args) {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;

        double myTotalValue = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("myTotalValue = " + myTotalValue);

        double theRemainder = myTotalValue % 40.00d;
        System.out.println("isRemainderZero = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("Got some remainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
