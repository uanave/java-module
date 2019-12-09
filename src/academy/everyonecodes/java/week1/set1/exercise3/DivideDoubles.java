package academy.everyonecodes.java.week1.set1.exercise3;

public class DivideDoubles {
    public static double divide(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

    public static void main(String[] args) {
        double numberOne = 57.5;
        double numberTwo = 5.5;
        double quotient = divide(numberOne, numberTwo);
        System.out.println("The quotient is " + quotient);
    }
}
