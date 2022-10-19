package java_programming_masterclass.java_learning.Exercises.Exercise_8_Area_Calculator;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println(areaCalculator.area(5.0));
        System.out.println(areaCalculator.area(-1));
        System.out.println(areaCalculator.area(5.0, 4.0));
        System.out.println(areaCalculator.area(-1.0, 4.0));
        areaCalculator.area(5.0);
        areaCalculator.area(-1);
        areaCalculator.area(5.0, 4.0);
        areaCalculator.area(-1.0, 4.0);
    }
}
