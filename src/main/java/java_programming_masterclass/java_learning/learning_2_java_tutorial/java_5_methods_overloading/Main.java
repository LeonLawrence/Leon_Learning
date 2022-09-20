package java_programming_masterclass.java_learning.learning_2_java_tutorial.java_5_methods_overloading;

public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Leon", 500);
        System.out.println("New score is " + newScore);

        int newScore1 = calculateScore(75);
        System.out.println("New score is " + newScore1);

        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored " + score + " points");
        return score *1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score *1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
