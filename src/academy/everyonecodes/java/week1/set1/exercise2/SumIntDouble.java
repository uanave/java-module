package academy.everyonecodes.java.week1.set1.exercise2;

public class SumIntDouble {
    public static int sumInt(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public static double sumDouble(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public static void main(String[] args) {
        int nbOne = 30;
        int nbTwo = 12;
        int sumInt = nbOne + nbTwo;
        double noOne = 6.1;
        double noTwo = 6.1;
        double sumDouble = noOne + noTwo;
        System.out.println("The int sum is " + sumInt);
        System.out.println("The int sum is " + sumDouble);
    }
}
