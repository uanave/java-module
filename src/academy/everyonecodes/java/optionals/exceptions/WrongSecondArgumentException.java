package academy.everyonecodes.java.evaluation2.optionals.Exceptions;

public class WrongSecondArgumentException extends Exception {
    public WrongSecondArgumentException(String message) {
        super("Argument not suported: " + message);
    }
}
