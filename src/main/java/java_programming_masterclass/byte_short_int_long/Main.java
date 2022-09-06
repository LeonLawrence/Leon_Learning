package java_programming_masterclass.byte_short_int_long;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;


        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);

        // overflow
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));

        // underflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);

    }
}
