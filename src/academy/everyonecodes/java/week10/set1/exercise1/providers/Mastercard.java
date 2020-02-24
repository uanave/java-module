package academy.everyonecodes.java.week10.set1.exercise1.providers;

import java.util.List;

public class Mastercard extends CreditCard {
    public Mastercard() {
        super("MASTERCARD");
    }

    @Override
    public boolean isValid(String cardNumber) {
        List<String> start = List.of("51", "52", "53", "54", "55");
        String startsWith = cardNumber.substring(0, 2);
        return (cardNumber.length() == 16 && start.contains(startsWith));
    }
}
