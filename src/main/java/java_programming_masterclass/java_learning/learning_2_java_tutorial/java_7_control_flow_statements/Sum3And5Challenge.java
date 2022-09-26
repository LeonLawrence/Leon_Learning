package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_7_control_flow_statements;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
               count++;
               sum += 1;
                System.out.println("Found number = " + i);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
