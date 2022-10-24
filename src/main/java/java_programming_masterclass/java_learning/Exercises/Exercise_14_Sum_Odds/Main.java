package java_programming_masterclass.java_learning.Exercises.Exercise_14_Sum_Odds;

import static java_programming_masterclass.java_learning.Exercises.Exercise_14_Sum_Odds.SumOdd.sumOdd;

public class Main {
    public static void main(String[] args) {
        System.out.println("The sum is " + sumOdd(1, 100));
        System.out.println("The sum is " + sumOdd(-1, 100));
        System.out.println("The sum is " + sumOdd(100, 100));
        System.out.println("The sum is " + sumOdd(13, 13));
        System.out.println("The sum is " + sumOdd(100, -100));
        System.out.println("The sum is " + sumOdd(100, 1000));
    }
}
