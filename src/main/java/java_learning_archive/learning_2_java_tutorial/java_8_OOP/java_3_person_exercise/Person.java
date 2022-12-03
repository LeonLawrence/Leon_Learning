package java_learning_archive.learning_2_java_tutorial.java_8_OOP.java_3_person_exercise;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public boolean isEmpty() {
        if (firstName == null) {
            return firstName.isEmpty();
        }
        if (lastName == null) {
            return lastName.isEmpty();
        }
        return false;
    }
}
