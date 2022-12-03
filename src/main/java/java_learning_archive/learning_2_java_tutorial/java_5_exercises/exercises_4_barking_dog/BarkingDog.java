package java_learning_archive.learning_2_java_tutorial.java_5_exercises.exercises_4_barking_dog;

public class BarkingDog {


    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        else if (hourOfDay < 8 || hourOfDay > 22) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }
}
