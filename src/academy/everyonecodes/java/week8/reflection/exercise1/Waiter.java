package academy.everyonecodes.java.week8.reflection.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class Waiter {
    private List<Cutlery> cutleryList = List.of(new Fork(), new Knife(), new Spoon());

    public List<Cutlery> getCutlery(String dish) {
        return cutleryList.stream()
                .filter(cutlery -> cutlery.isUsedFor(dish))
                .collect(Collectors.toList());
    }
}
