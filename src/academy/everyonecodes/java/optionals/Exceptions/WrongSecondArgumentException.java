package academy.everyonecodes.java.optionals.Exceptions;

public class WrongSecondArgumentException extends Exception {
    public WrongSecondArgumentException(String message) {
        super("Argument not suported: " + message);
    }
}
