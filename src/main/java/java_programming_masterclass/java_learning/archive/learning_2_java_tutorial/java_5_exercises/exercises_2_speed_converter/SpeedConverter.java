package java_programming_masterclass.java_learning.archive.learning_2_java_tutorial.java_5_exercises.exercises_2_speed_converter;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        return milesPerHour;
//        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else {
             long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "Km/h = " + milesPerHour + "mi/h");
        }

    }
}
