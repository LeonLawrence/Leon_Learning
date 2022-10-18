package java_programming_masterclass.java_learning.Exercises.Exercise_1_Speed_Converter;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);

//        Long milesPerHour = Math.round(kilometersPerHour / 1.609);
//        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            Long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour +
                "km/h = " + milesPerHour +
                "mi/h");
        }
    }
}
