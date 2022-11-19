package java_programming_masterclass.java_learning.archive.learning_2_java_tutorial.java_5_exercises.exercises_2_speed_converter;

public class Main {
    public static void main(String[] args) {
        double miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

    }
}
