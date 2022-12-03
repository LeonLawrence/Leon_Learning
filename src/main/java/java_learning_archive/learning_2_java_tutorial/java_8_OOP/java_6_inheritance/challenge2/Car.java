package java_learning_archive.learning_2_java_tutorial.java_8_OOP.java_6_inheritance.challenge2;

public class Car extends Vehicle {

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
