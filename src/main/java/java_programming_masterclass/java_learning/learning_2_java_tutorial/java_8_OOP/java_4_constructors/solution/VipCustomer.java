package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_8_OOP.java_4_constructors.solution;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Leon", 800, "leon@email.com");
    }

    public VipCustomer(String emailAddress) {
        this("Tony", 1000, emailAddress);
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
