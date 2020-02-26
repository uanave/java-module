package academy.everyonecodes.java._optionals.exceptions;

public class WrongFirstArgumentException extends Exception {
    public WrongFirstArgumentException(String message) {
        super("Argument not suported: " + message);
    }
}
