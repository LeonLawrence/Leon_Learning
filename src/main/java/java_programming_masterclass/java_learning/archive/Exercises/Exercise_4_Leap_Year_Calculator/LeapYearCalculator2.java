package java_programming_masterclass.java_learning.archive.Exercises.Exercise_4_Leap_Year_Calculator;

public class LeapYearCalculator2 {

    // Purpose: Is year a leap Year

    private boolean isLeapYear(int year) {
        // Invalid options
        if (year >= 1 && year <= 9999) {
            // Purpose
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public void printCalculation(int year) {
        boolean leapYear = isLeapYear(year);
        System.out.println(leapYear);
    }

}
