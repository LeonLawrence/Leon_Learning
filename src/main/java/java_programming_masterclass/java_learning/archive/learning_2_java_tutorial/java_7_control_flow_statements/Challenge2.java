package java_programming_masterclass.java_learning.archive.learning_2_java_tutorial.java_7_control_flow_statements;

public class Challenge2 {
    public static void main(String[] args) {
printNumberInWord(-1);
printNumberInWord(0);
printNumberInWord(1);
printNumberInWord(2);
printNumberInWord(9);
printNumberInWord(10);
    }

    public static void printNumberInWord(int number) {

        switch (number) {

            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }

    }
}
