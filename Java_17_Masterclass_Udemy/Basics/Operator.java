package Basics;

public class Operator {
    public static void main(String[] args) {
        double a = 20.00d;
        double b = 80.00d;
        double c = (a + b) * 100.00d;
        System.out.println("Total = " + c);
        double d = c % 40.00d;
        System.out.println("remainder =" + d);

        boolean noRemainder = (d == 0) ? true : false;
        System.out.println("d = " + noRemainder);

        if (!noRemainder) {
            System.out.println("Got some remainder");
        }
    }
}