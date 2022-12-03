package java_learning_archive.learning_2_java_tutorial.java_5_exercises.exercises_1_if_statements;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(0);
        checkNumber(-3);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        }
    }
}
