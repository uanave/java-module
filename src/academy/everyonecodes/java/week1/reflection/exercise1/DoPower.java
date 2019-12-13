package academy.everyonecodes.java.week1.reflection.exercise1;

public class DoPower {
    public static int raiseToPower(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int result = raiseToPower(5, 2);
    }
}
