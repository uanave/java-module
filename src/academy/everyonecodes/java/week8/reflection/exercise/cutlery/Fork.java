package academy.everyonecodes.java.week8.reflection.exercise.cutlery;

import java.util.List;

public class Fork implements Cutlery {
    @Override
    public String getName() {
        return "Fork";
    }

    @Override
    public boolean isUsedFor(String dish) {
        if (!dish.isBlank()) {
            List<String> dishes = List.of("Fish", "Pizza", "Pasta");
            if (dishes.contains(dish)) {
                return true;
            }

        }
        return false;
    }

}
