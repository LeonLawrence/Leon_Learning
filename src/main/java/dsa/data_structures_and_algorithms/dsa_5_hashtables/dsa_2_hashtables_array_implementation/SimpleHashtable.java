package dsa.data_structures_and_algorithms.dsa_5_hashtables.dsa_2_hashtables_array_implementation;

public class SimpleHashtable {


    private Employee[] hashtable;

    public SimpleHashtable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashKey = hashKey(key);

        if (hashtable[hashKey] != null) {
            System.out.println("Sorry, there's already an employee at position " + hashKey);
        } else {
            hashtable[hashKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashedkey = hashKey(key);
        return hashtable[hashedkey];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
}
