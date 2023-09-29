package Basics;

public class ex1_Challenge {
    public static void main(String[] args) {

        int highScore = calculateScore(1500);
        printScore("Tim", highScore);

        highScore = calculateScore(900);
        printScore("Bob", highScore);

        highScore = calculateScore(600);
        printScore("James", highScore);

        highScore = calculateScore(100);
        printScore("Mery", highScore);

    }

    public static void printScore(String playername, int highScore) {
        System.out.println(playername + "your position" + highScore + "on the list");
    }

    public static int calculateScore(int playerScore) {

        int position = 4;
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
