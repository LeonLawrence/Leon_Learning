package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_8_OOP.java_7_Composition.challenge2;

public class Main {

        /*
    - Create a single room of a house using composition.
    - Think about the things that should be included in the room.
    - Maybe physical parts of the house, but furniture as well.
    - Add at least one method to access an object via a getter and
    - then that objects public method as you saw in the previous video.
    - then add at least one method to hide and object e.g.
     */


    public static void main(String[] args) {
    Wall wall1 = new Wall("West");
    Wall wall2 = new Wall("East");
    Wall wall3 = new Wall("South");
    Wall wall4 = new Wall("North");

    Ceiling ceiling = new Ceiling(12, 55);

    Bed bed = new Bed("Modern", 4, 3, 2, 1);

    Lamp lamp = new Lamp("Classic", false, 75);

    Bedroom bedRoom = new Bedroom("Leon", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
    bedRoom.makeBed();

    bedRoom.getLamp().turnOn();
    }

}
