package Basics;

public class and_Or {
    public static void main(String[] args) {
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("you got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and lees than 100");
        }
        if ((topScore > 90)) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
        int newValue = 50;
        if (newValue == 50)
//        if (newValue = 50) {
            System.out.println("This is an error");
    }
    boolean isCar = false;
        if (isCar = true) {
        // (isCar == true) = (isCar)
        // (isCar == false) = (!iscar) = (iscar != true)
        // 일반적으로 축약된 방식을 사용하는걸 추천!
        System.out.println("This is not supposed to happen");
    }
}
}
