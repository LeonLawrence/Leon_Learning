package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_5_exercises.exercises_3_MegaBytesConverter;

public class MegaBytesConverter {

    public static int megaBytes = 1;
    public static int kiloBytes = 1024;

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainingKiloBytes = megaBytes  + megaBytes % kiloBytes;
            System.out.println(kiloBytes + "KB = " + megaBytes + "MB " + remainingKiloBytes + "KB ");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        System.out.println("-------------------");
        printMegaBytesAndKiloBytes(-1024);
        System.out.println("-------------------");
        printMegaBytesAndKiloBytes(5000);
    }
}
