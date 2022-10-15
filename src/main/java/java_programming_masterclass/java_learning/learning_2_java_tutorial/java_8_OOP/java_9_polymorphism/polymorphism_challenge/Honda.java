package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_8_OOP.java_9_polymorphism.polymorphism_challenge;

public class Honda extends Car {

    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}
