package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_8_OOP.java_8_encapsulation.challenge1;

public class Main {
    public static void main(String[] args) {
        /*
        - Create a class and demonstrate proper encapsulation techniques
        - The class with be called Printer
        - It will Simulate a real Computer Printer
        - It should have fields for the toner Level, number of pages printed, and
          also whether it's a duplex printer (capable of printing on both sides of the paper).
        - Add methods to fill up the toner (up to a maximum of 100%), another method to
        - simulate printing a page (which should increase the number of pages printed).
        - Decide on the scope, whether to use constructors, and anything else you think is needed.
         */

        Printer printer = new Printer(50, false);
        System.out.println("inital page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
