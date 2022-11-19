package java_programming_masterclass.java_learning.archive.learning_2_java_tutorial.java_8_OOP.java_6_inheritance.challenge1;

public class Main {

    public static void main(String[] args) {

        /*
         Challenge

         Start with a base class of a vehicle, then create a Car class that inherits from this base class.
         Finally, create another class, a Specific type of Car that inherits from the Car class.
         You should be able to hand steering, changing gears, and moving (speed in other words).
         You will want to decide where to put the appropriate state and behaviours (fields and methods).
         As mentioned above, changing gears, increasing/decreasing speed should be included.
         For you specific type of vehicle you will want to add something specific for that type of car.
         */

        Ford ford = new Ford(36);
        ford.steer(45);
        ford.accelerate(30);
        ford.accelerate(20);
        ford.accelerate( - 42);

    }
}
