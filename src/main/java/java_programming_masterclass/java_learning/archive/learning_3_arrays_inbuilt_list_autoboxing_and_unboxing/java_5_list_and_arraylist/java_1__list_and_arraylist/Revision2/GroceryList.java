package java_programming_masterclass.java_learning.archive.learning_3_arrays_inbuilt_list_autoboxing_and_unboxing.java_5_list_and_arraylist.java_1__list_and_arraylist.Revision2;

import java.util.ArrayList;

public class GroceryList {

    private static ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static void addGroceryItem(String item) {

        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private static void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private static void removeGroceryItem(int position) {
//        String theItem = groceryList.get(position);
        groceryList.remove(position);
        // Milk
        // Bread
    }

    private int findItem(String searchItem) {

        return groceryList.indexOf(searchItem);
//        boolean exist = groceryList.contains(searchItem);

//        int position = groceryList.indexOf(searchItem);
//
//        if (position >= 0) {
//            return groceryList.get(position);
//        }
//        return null;
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}
