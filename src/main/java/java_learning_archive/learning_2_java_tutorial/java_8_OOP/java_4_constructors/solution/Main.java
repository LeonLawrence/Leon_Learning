package java_learning_archive.learning_2_java_tutorial.java_8_OOP.java_4_constructors.solution;

public class Main {
    public static void main(String[] args) {
//        Account leonsAccount = new Account("12345", 100,"Leon Lawrence", "Leon@email.com","07111111111");
//        Account leonsAccounttest = new Account();
//        leonsAccount.withdrawal(100);
//
//        leonsAccount.deposit(50);
//        leonsAccount.withdrawal(100);
//
//        leonsAccount.deposit(51);
//        leonsAccount.withdrawal(100);
//        System.out.println("-----------");
//        System.out.println(leonsAccounttest.getBalance());
//        System.out.println(leonsAccounttest.getCustomerName());
//
//        System.out.println("-----------");
//        Account testAccount = new Account("Test", "test@gmail.com", "12345");
//        System.out.println(testAccount.getCustomerName());
//
//        System.out.println("-----------");
        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmailAddress());

        System.out.println("-----------");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("bob", 25000.00, "bob@email.com");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());

    }
}
