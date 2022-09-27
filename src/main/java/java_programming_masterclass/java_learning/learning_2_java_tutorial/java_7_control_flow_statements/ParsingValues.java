package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_7_control_flow_statements;

public class ParsingValues {
    public static void main(String[] args) {
        String numberAsString = "2022";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);
        System.out.println("-------------------------------------");

        numberAsString += 1;
        number +=1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
