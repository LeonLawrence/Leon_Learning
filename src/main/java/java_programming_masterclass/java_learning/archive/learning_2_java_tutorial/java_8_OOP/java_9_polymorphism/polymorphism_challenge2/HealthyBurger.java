package java_programming_masterclass.java_learning.archive.learning_2_java_tutorial.java_8_OOP.java_9_polymorphism.polymorphism_challenge2;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemisedHamburger() {
        double hamburgerPrice = super.itemisedHamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}