package data_structures_and_algorithms.dsa_2_lists.dsa_2_array_lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Joanes", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));


        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());
        System.out.println("--------------------------------------------------------------------");
        employeeList.set(1, new Employee("John", "Adams", 4568));
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
