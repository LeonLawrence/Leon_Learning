package java_learning_archive.learning_2_java_tutorial.java_3_code_blocks_and_if_then_else;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less 5000, but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        // CODING CHALLENGE
        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8;
        // bonus set to 200
        // But make sure the first printout above still displays as well.

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int secondScore = score + (levelCompleted * bonus);
            System.out.println("Your second score is: " + secondScore);
        }
    }
}
