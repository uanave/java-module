package academy.everyonecodes.java.week4.reflection.exercise1;

public class FromZeroRounder {
    public double round(double number) {
        if (number > 0) {
            return Math.ceil(number);
        }
        return Math.floor(number);
    }
}
