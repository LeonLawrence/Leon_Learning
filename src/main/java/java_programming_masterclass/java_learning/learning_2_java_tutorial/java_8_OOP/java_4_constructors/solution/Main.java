package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_8_OOP.java_4_constructors.solution;

public class Main {
    public static void main(String[] args) {
        Account leonsAccount = new Account("12345", 100,"Leon Lawrence", "Leon@email.com","07111111111");
        Account leonsAccounttest = new Account();
        leonsAccount.withdrawal(100);

        leonsAccount.deposit(50);
        leonsAccount.withdrawal(100);

        leonsAccount.deposit(51);
        leonsAccount.withdrawal(100);
        System.out.println("-----------");
        System.out.println(leonsAccounttest.getBalance());
        System.out.println(leonsAccounttest.getCustomerName());

    }
}
