package academy.everyonecodes.java.week10.set1.exercise1.providers;

import java.util.List;

public class Providers {

    public static List<CreditCard> get() {
        return List.of(
                new AmericanExpress(),
                new Mastercard(),
                new Visa()
        );
    }
}
