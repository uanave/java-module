package academy.everyonecodes.java.week8.reflection.exercise1;

import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Cutlery;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Fork;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Knife;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Spoon;

import java.util.List;
import java.util.stream.Collectors;

public class Waiter {
    private List<Cutlery> cutleryList = List.of(new Fork(), new Knife(), new Spoon());

    public List<String> getCutlery(String dish) {
        return cutleryList.stream()
                .filter(cutlery -> cutlery.isUsedFor(dish))
                .map(Cutlery::getName)
                .collect(Collectors.toList());
    }
}
