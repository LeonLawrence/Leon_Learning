package java_programming_masterclass.java_learning.archive.learning_2_java_tutorial.java_8_OOP.java_1_classes;

public class Main1 {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        Car ford = new Car();

        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());


    }
}
