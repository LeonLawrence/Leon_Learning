package java_programming_masterclass.byte_short_int_long;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;


        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // overflow
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));

        // underflow
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);

        System.out.println("----------------------------------------------------");

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myByteMinValue);
        System.out.println("Byte Maximum Value = " + myByteMaxValue);

        System.out.println("----------------------------------------------------");

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myShortMinValue);
        System.out.println("Short Maximum Value = " + myShortMaxValue);

        System.out.println("----------------------------------------------------");

        long myLongValue = 100L;

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myLongMinValue);
        System.out.println("Long Maximum Value = " + myLongMaxValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        System.out.println(bigShortLiteralValue);
    }
}
