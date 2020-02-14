package academy.everyonecodes.java.week8.reflection.exercise.cutlery;

import java.util.List;

public class Knife implements Cutlery {
    @Override
    public String getName() {
        return "Knife";
    }

    @Override
    public boolean isUsedFor(String dish) {
        if (!dish.isBlank()) {
            List<String> dishes = List.of("Fish", "Pizza");
            if (dishes.contains(dish)) {
                return true;
            }
        }

        return false;
    }
}
