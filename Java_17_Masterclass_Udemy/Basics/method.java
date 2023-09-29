package Basics;

public class method {
    public static void main(String[] args) {
        // public static void mainAlien() {}
        // 이름이 있으나 데이터는 받지 않고 메서드로부터
        // 데이터도 반환하지 않음

        // 메서드 안에 다른 명명된 메서드를 넣을 수는 없다

        int highScore = calculateScore(true, 800, 5, 200);
        System.out.println("The highScore is " + highScore);

        //4개의 실제 값을 보내주길 기대한다
        System.out.println("The next highScore is " +
        calculateScore(true, 10000, 8, 100));
        }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // 매개변수 설정 boolean gameOver, int score, int levelCompleted , int bonus
        // 매개변수로 정의된 메서드를 실행할때는 변수와 유형에 맞는 값, 식을 전달해야 한다
        // calculateScore(true, 800, 5, 100);

        int lastScore = score;

        if (gameOver) {
            lastScore += (levelCompleted * bonus);
            lastScore += 1000;

        }
        return lastScore;
    }
}