package academy.everyonecodes.java.evaluation2.optionals.exceptions;

public class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super("Not supported: " + message);
    }
}
