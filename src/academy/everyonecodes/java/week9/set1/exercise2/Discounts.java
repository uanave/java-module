package academy.everyonecodes.java.week9.set1.exercise2;

import java.util.List;

public class Discounts {
    static List<Discount> get() {
        return List.of(
                new FiveOnWine(),
                new TenOnVeggies(),
                new SevenOnSweets()
        );
    }
}
