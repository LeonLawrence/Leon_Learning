package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_7_control_flow_statements;

public class Challenge {
    public static void main(String[] args) {

    }

    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
            case 5:
                System.out.println("Thursday");
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("day not found");
        }

    }
}
