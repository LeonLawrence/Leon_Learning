package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_5_exercises.exercises_6_leap_year;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <=9999) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }
}
