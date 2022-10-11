package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_8_OOP.java_6_inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");


//        dog.eat();
        dog.walk();
//        dog.run();

    }
}
