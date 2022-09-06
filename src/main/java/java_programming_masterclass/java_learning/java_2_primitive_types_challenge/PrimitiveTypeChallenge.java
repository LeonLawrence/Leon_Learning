package java_programming_masterclass.java_learning.java_2_primitive_types_challenge;

public class PrimitiveTypeChallenge {
    public static void main(String[] args) {

        /*
        Primitive Types Challenge

        Your challenge is to create a byte variable and set it to any valid byte number,
        it doesn't matter. Create a short variable and set it to any valid short number.

        Create an int variable and set it to any valid int number. Lastly, create a
        variable of type long and make it equal to 50000 plus 10 times the sum of
        the byte plus the short plus the integer values.
         */

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000L;

        int sum = myByte + myShort + myInt;
        int newSum = (int) myLong + 10 * sum;
        System.out.println(newSum);

        /*
        Course Solution:
        long longTotal = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println(longTotal);
         */

        /*
        Non Challenge Example:
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
         */
    }
}
