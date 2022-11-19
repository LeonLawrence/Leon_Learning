package java_programming_masterclass.java_learning.archive.learning_2_java_tutorial.java_8_OOP.java_9_polymorphism.polymorphism_challenge2;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "white");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to the deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to the deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to the deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to the deluxe burger");;
    }
}
