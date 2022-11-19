package java_programming_masterclass.java_learning.archive.learning_2_java_tutorial.java_8_OOP.java_4_constructors;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.setAccountNumber(123456789);
        bank.setBalance(1000);
        bank.setCustomerName("Leon Lawrence");
        bank.setEmail("LeonL@outlook.com");
        bank.setPhoneNumber(0711111111);

        bank.displayCustomerDetails();
        System.out.println("--------------------------");


        bank.deposit(800);
        bank.displayCustomerDetails();

        System.out.println("--------------------------");

        bank.withdraw(300);
        bank.displayCustomerDetails();
    }
}
