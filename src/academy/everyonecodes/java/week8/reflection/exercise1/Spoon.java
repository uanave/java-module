package academy.everyonecodes.java.week8.reflection.exercise1;

import java.util.List;

public class Spoon implements Cutlery{

    @Override
    public String getName() {
        return "Soup";
    }

    @Override
    public boolean isUsedFor(String dish) {
        List<String> dishes = List.of("Soup");
        if (dishes.contains(dish)) {
            return true;
        }
        return false;
    }
}
