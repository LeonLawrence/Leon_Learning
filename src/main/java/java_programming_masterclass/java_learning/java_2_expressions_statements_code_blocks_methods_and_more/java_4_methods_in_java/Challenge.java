package java_programming_masterclass.java_learning.java_2_expressions_statements_code_blocks_methods_and_more.java_4_methods_in_java;

public class Challenge {
    public static void main(String[] args) {

        displayHighScorePosition("Leon", calculateHighScorePosition(2000));
        displayHighScorePosition("Tony", calculateHighScorePosition(800));
        displayHighScorePosition("Binh", calculateHighScorePosition(150));
    }

    public static void displayHighScorePosition(String playersName, int highScorePosition) {

        System.out.println(playersName + " managed to get into position " + highScorePosition
                + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
