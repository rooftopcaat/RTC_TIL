public class structure_Of_the_Method {
    public static void main(String[] args) {
        // public static void mainAlien() {}
        // 이름이 있으나 데이터는 받지 않고 메서드로부터
        // 데이터도 반환하지 않음

        // 메서드 안에 다른 명명된 메서드를 넣을 수는 없다

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        calculateScore();

        int lastScore = score;

        if (gameOver) {
            lastScore += (levelCompleted * bonus);
            System.out.println("Your last score was " + lastScore);
        }

    }
    public static void calculateScore() {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int lastScore = score;

        if (gameOver == true) {
            lastScore += (levelCompleted * bonus);
            System.out.println("Your lastScore was " + lastScore);

        }
    }
}
