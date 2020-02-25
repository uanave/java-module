package academy.everyonecodes.java.week10.set1.exercise1.providers;

public class AmericanExpress extends Provider {
    public AmericanExpress() {
        super("AMERICAN EXPRESS");
    }

    @Override
    public boolean isValid(String cardNumber) {
        return (cardNumber.length() == 15 && (cardNumber.startsWith("34") || cardNumber.startsWith("37")));
    }
}
