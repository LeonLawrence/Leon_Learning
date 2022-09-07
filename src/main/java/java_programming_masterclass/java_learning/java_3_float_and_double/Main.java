package java_programming_masterclass.java_learning.java_3_float_and_double;

public class Main {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMaxFloatValue);
        System.out.println("Float minimum value = " + myMinFloatValue);

        System.out.println("----------------------------------------------------------");

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value = " + myMaxDoubleValue);
        System.out.println("double minimum value = " + myMinDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("myIntValue = " +myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
    }
}
