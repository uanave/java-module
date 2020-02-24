package academy.everyonecodes.java.week10.set1.exercise1;

import academy.everyonecodes.java.week10.set1.exercise1.providers.CreditCard;
import academy.everyonecodes.java.week10.set1.exercise1.providers.Providers;

import java.util.List;
import java.util.Optional;

public class Credit {

    List<CreditCard> providers = Providers.get();

    public String evaluate(long cardNumber) {
        String card = cardNumber + "";
        String finalCard = card.trim();

        if (Luhn.check(finalCard)) {
            Optional<CreditCard> match = providers.stream()
                    .filter(creditCard -> creditCard.isValid(finalCard))
                    .findFirst();

            if (match.isPresent()) {
                return match.get().getCardName();
            }
            return "NOT SUPPORTED";
        }
        return "INVALID";
    }
}
