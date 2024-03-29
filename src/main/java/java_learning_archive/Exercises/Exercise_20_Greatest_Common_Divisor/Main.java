package java_learning_archive.Exercises.Exercise_20_Greatest_Common_Divisor;

public class Main {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        int gcd = 0; // Stores the greatest common divisor

        if (first > 10 && second > 10) {

            for (int i = 1; i <= first && i <= second; i++) {

                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                }
            }
        } else {
            return -1;
        }
        return gcd;
    }
}
