package dsa.data_structures_and_algorithms.dsa_4_queues.dsa_2_circular_queue_implementation_part_2;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

       ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);

        queue.printQueue();


        System.out.println(queue.peek());
        System.out.println("----------------");
        queue.remove();
        queue.remove();
        queue.remove();

        queue.printQueue();
    }
}
