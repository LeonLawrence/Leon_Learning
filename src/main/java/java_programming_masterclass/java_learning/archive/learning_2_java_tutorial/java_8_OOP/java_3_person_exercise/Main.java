package java_programming_masterclass.java_learning.archive.learning_2_java_tutorial.java_8_OOP.java_3_person_exercise;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Leon");
        person.setLastName("Lawrence");
        person.setAge(27);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());


        System.out.println(person.getFullName());
        System.out.println(person.isEmpty());
        System.out.println(person.getFirstName());
        System.out.println(person.isEmpty());
        System.out.println(person.getLastName());
        System.out.println(person.isEmpty());
        System.out.println(person.getAge());

        System.out.println(person.getFullName());
        System.out.println(person.isEmpty());

    }
}
