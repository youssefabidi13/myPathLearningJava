package academy.learnprogramming;

public class Main {
    //method main
    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
    }

    //    public static void calculateScore(boolean game0ver,int score,int levelCompleted,int bonus ) {
//        if (game0ver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }
//    }
    //or
    public static int calculateScore(boolean game0ver, int score, int levelCompleted, int bonus) {
        if (game0ver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int postionInHighScore) {
        System.out.println(playerName + " managed get into position " + postionInHighScore + " on the high score table");
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