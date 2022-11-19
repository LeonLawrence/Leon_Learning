package java_programming_masterclass.java_learning.archive.learning_2_java_tutorial.java_8_OOP.java_9_polymorphism.polymorphism_challenge;

public class Audi extends Car {

    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Audi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Audi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Audi -> brake()";
    }
}
