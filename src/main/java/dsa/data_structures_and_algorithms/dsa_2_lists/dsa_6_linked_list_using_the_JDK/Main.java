package dsa.data_structures_and_algorithms.dsa_2_lists.dsa_6_linked_list_using_the_JDK;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 3567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        Iterator iterator = list.iterator();
        System.out.print("  HEAD ->  ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print("  <=>  ");
        }
        System.out.println("  null  ");

        list.add(billEnd);
        iterator = list.iterator();
        System.out.print("  HEAD ->  ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print("  <=>  ");
        }
        System.out.println("  null  ");

        list.removeFirst();
        iterator = list.iterator();
        System.out.print("  HEAD ->  ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print("  <=>  ");
        }
        System.out.println("  null  ");

        list.removeLast();
        iterator = list.iterator();
        System.out.print("  HEAD ->  ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print("  <=>  ");
        }
        System.out.println("  null  ");

//        for (Employee employee : list) {
//            System.out.println(employee);
//        }
    }
}
