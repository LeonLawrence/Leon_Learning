package java_programming_masterclass.java_learning.Exercises.Exercise_13_Number_of_Days_in_Month;

public class NumberOfDaysInMonth {

    public boolean isLeapYear(int year) {
        if (year > 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0 || year % 400 == 0) {
                    return true;
                }
            }
        }
            return false;
    }
}
