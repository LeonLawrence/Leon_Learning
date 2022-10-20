package java_programming_masterclass.java_learning.Exercises.Exercise_9_Minutes_to_Year_and_Days_Calculator;

public class MinutesToYearAndDayCalculator2 {

    long years = 0; // stores minutes converted into years
    long days = 0; // store minutes converted into days

    public void printYearsAndDay(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // Calculations
        years = (minutes / 525600);
        days = (minutes % 525600) / 1440;

        // Output
        System.out.println(minutes + " min = " + years + " y " + days + " d");
    }
}
