package academy.everyonecodes.java.week8.reflection.exercise.cutlery;

public class Spoon implements Cutlery {

    @Override
    public String getName() {
        return "Spoon";
    }

    @Override
    public boolean isUsedFor(String dish) {
        if (!dish.isBlank()) {
            return dish.equals("Soup");
        }

        return false;
    }
}
