package java_programming_masterclass.java_learning.archive.learning_2_java_tutorial.java_2_statements_whitespace_and_Indentation;

public class Main {
    public static void main(String[] args) {

        int myVariable = 50;
        if (myVariable == 50) {
            System.out.println("Printed");
        }

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");
    }
}
