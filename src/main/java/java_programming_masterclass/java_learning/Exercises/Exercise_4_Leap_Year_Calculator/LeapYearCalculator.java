package java_programming_masterclass.java_learning.Exercises.Exercise_4_Leap_Year_Calculator;

public class LeapYearCalculator {

    // Purpose: Is year a leap Year

    private boolean isLeapYear(int year) {
        // Invalid options
        if (year >= 1 && year <= 9999) {
            // Purpose
            if (year % 4 == 0) {
                if (year % 100 == 0 || year % 400 == 0) {
                    return true;
                }
            }
        }
        System.out.print("The Year is not a leap year (it has 365 days) = ");
        return false;
    }

    public void printCalculation(int year) {
        boolean leapYear = isLeapYear(year);
        System.out.println(leapYear);
    }

}
