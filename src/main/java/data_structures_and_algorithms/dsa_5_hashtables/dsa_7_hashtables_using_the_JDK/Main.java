package data_structures_and_algorithms.dsa_5_hashtables.dsa_7_hashtables_using_the_JDK;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);

        Iterator<Employee> iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
