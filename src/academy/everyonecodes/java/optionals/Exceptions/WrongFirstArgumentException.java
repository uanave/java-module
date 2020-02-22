package academy.everyonecodes.java.optionals.Exceptions;

public class WrongFirstArgumentException extends Exception {
    public WrongFirstArgumentException(String message) {
        super("Argument not suported: " + message);
    }
}
