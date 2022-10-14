package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_8_OOP.java_8_encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//
//        player.fullName = "Leon";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Leon", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());

    }
}
