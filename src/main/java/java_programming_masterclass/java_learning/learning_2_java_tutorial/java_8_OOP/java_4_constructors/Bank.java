package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_8_OOP.java_4_constructors;

public class Bank {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double deposit(double deposited) {
        this.balance += deposited;
        return this.balance;
    }

    public double withdraw(double withdrawn) {
        this.balance -= withdrawn;
        return this.balance;
    }


    public void displayCustomerDetails() {
        System.out.println(getAccountNumber() + "\n" + getBalance() + "\n" + getCustomerName() + "\n" + getEmail() + "\n" + getPhoneNumber());
    }
}
