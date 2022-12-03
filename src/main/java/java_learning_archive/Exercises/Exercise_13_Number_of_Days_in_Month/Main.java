package java_learning_archive.Exercises.Exercise_13_Number_of_Days_in_Month;

public class Main {

    public static void main(String[] args) {
        NumberOfDaysInMonth numberOfDaysInMonth = new NumberOfDaysInMonth();

        System.out.println(numberOfDaysInMonth.isLeapYear(1600));
        System.out.println(numberOfDaysInMonth.isLeapYear(2017));
        System.out.println(numberOfDaysInMonth.isLeapYear(2000));
    }
}
