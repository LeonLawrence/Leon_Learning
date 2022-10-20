package java_programming_masterclass.java_learning.Exercises.Exercise_9_Minutes_to_Year_and_Days_Calculator;

public class MinutesToYearAndDayCalculator {

    public void printYearsAndDay(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }

        // Calculations
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long remainingDays = days % 365;

        // Output
        System.out.println(minutes + " min = " + years + " y " + remainingDays + " d");
    }
}
