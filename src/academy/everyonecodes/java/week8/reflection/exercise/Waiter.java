package academy.everyonecodes.java.week8.reflection.exercise;

import academy.everyonecodes.java.week8.reflection.exercise.cutlery.Cutlery;
import academy.everyonecodes.java.week8.reflection.exercise.cutlery.Fork;
import academy.everyonecodes.java.week8.reflection.exercise.cutlery.Knife;
import academy.everyonecodes.java.week8.reflection.exercise.cutlery.Spoon;

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
