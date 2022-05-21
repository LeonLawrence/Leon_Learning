package data_structures_and_algorithms.dsa_5_hashtables.dsa_6_chaining;

import java.util.LinkedList;

public class ChainedHashtable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;

    }
}
