package java_programming_masterclass.java_learning.Exercises.Exercise_3_Barking_Dog;

public class Main {
    public static void main(String[] args) {
        BarkingDog dog = new BarkingDog();
        boolean wakeUp;

        wakeUp = dog.shouldWakeUp(true, 1);
        System.out.println(wakeUp);

        wakeUp = dog.shouldWakeUp(false, 2);
        System.out.println(wakeUp);

        wakeUp = dog.shouldWakeUp(true, 8);
        System.out.println(wakeUp);

        wakeUp = dog.shouldWakeUp(true, -1);
        System.out.println(wakeUp);
    }
}
