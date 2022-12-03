package java_learning_archive.learning_2_java_tutorial.java_4_methods;

public class Main2 {

    public static void main(String[] args) {
        displayHighScorePosition("Leon", calculateHighScorePosition(1400));
        displayHighScorePosition("Tony", calculateHighScorePosition(900));
        displayHighScorePosition("Binh", calculateHighScorePosition(400));
        displayHighScorePosition("Stephen", calculateHighScorePosition(50));

        int highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Maik", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }


    static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//            return 4;

        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
