package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_7_control_flow_statements;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        int age = 2022 - yearOfBirth;

        System.out.println("Your name is " + name);
        System.out.println("You was born in the year: " + yearOfBirth);
        System.out.println("Your age is: " + age);

        scanner.close();
    }
}
