package java_programming_masterclass.java_learning.archive.learning_2_java_tutorial.java_4_methods;

public class Main {
    public static void main(String[] args) {

        test2();
        System.out.println("----------------------------");

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }


    // CHALLENGE
    // Create a method called displayHighScorePosition
    // it should display a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an int
    // the return data should be
    // 1 if the score >1000
    // 2 if the score is >500 and < 1000
    // 3 if the score is > 100 and < 500
    // 4 in all other cases
    // Call both methods and display the results of the following
    // a score of 1500, 900, 400, and 50.


    String playerName = null;
    int highScorePosition = 0;
    int highScore = 0;

    public static void test() {

        displayHighScorePosition("Leon", 1500);
        displayHighScorePosition("Tony", 900);
        displayHighScorePosition("Binh", 400);
        displayHighScorePosition("Stephen", 50);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println("Player name: " + playerName + " with a score of: " + position);
        calculateHighScorePosition(position);
    }

    private static int calculateHighScorePosition(int playerScore) {

        if (playerScore > 1000) {
            System.out.println("position: " + 1);
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            System.out.println("position: " + 2);
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            System.out.println("position: " + 3);
            return 3;
        } else {
            System.out.println("position: " + 4);
            return 4;
        }
    }

    // ---------------------------------------------------------

    /*
    CHALLENGE SOLUTION

     */

    public static void test2() {
        int highScorePosition = calculateHighScorePosition2(1500);
        displayHighScorePosition2("Tim", highScorePosition);
    }

    public static void displayHighScorePosition2(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
         + highScorePosition + " on the high score table");
    }


    private static int calculateHighScorePosition2(int playerScore) {

        if (playerScore > 1000) {
            System.out.println("position: " + 1);
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            System.out.println("position: " + 2);
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            System.out.println("position: " + 3);
            return 3;
        } else {
            System.out.println("position: " + 4);
            return 4;
        }
    }
}
