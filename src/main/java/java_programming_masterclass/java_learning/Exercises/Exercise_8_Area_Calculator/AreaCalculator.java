package java_programming_masterclass.java_learning.Exercises.Exercise_8_Area_Calculator;

public class AreaCalculator {

    private double circleArea = 0;
    private double rectangleArea = 0;

    public double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        circleArea = radius * radius * Math.PI;
        return circleArea;
    }

    public double area(double x, double y) {
        if (x < 0 || y < 0 || (x < 0 && y < 0)) {
            return -1.0;
        }
        return x * y;
    }
}
