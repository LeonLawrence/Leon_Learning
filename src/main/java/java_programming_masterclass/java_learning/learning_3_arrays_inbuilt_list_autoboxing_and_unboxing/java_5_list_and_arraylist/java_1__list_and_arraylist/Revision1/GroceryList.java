package java_programming_masterclass.java_learning.learning_3_arrays_inbuilt_list_autoboxing_and_unboxing.java_5_list_and_arraylist.java_1__list_and_arraylist.Revision1;

import java.util.ArrayList;

public class GroceryList {

    private static ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static void addGroceryItem(String item) {

        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public static void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public static void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        // Milk
        // Bread
    }

    public String findItem(String searchItem) {
//        boolean exist = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);

        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
