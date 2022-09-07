package java_programming_masterclass.java_learning.java_4_float_and_double_challenge;

public class Main {
    public static void main(String[] arg) {

        /*
        CHALLENGE:

        Convert a given number of pounds to kilograms.

        STEPS:
        1. Create a variable with the appropriate type to store the number of pounds to be
        converted to kilograms.
        2. Calculate the result i.e the number of kilograms based on the contents of the variable
        above and store the result in a 2nd appropriate variable.
        3. Print out the results.

        HINT: 1 pound is equal to 0.45359237 to a kilogram. This should help you perform the calculation.
         */

        double pounds = 200;

        double kilograms = 0.45359237;

        System.out.println("your value in pounds: " + pounds);
        System.out.println("Kilogram conversion: " + pounds * kilograms);


        /*
        solution:

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms;

         */

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
