package academy.everyonecodes.java.week10.set1.exercise1.providers;

public class Visa extends Provider {
    public Visa() {
        super("VISA");
    }

    @Override
    public boolean isValid(String cardNumber) {
        return ((cardNumber.length() == 13 || cardNumber.length() == 16) && cardNumber.startsWith("4"));
    }
}
