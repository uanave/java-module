package academy.everyonecodes.java.week1.set1.exercise3;

public class DivideDoubles {
    public static double divide(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

    public static void main(String[] args) {
        double nbOne = 57.5;
        double nbTwo = 5.5;
        double quotient = divide(nbOne, nbTwo);
        System.out.println("The quotient is " + quotient);
    }
}
