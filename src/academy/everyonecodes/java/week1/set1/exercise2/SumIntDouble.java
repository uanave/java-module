package academy.everyonecodes.java.week1.set1.exercise2;

public class SumIntDouble {
    public static int sumInt(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public static double sumDouble(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public static void main(String[] args) {
        int numberOne = 30;
        int numberTwo = 12;
        int sumInt = numberOne + numberTwo;
        double numberThree = 6.1;
        double numberFour = 6.1;
        double sumDouble = numberThree + numberFour;
        System.out.println("The int sum is " + sumInt);
        System.out.println("The int sum is " + sumDouble);
    }
}
