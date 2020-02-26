package academy.everyonecodes.java.optionals.exceptions;

public class WrongSecondArgumentException extends Exception {
    public WrongSecondArgumentException(String message) {
        super("Argument not suported: " + message);
    }
}
