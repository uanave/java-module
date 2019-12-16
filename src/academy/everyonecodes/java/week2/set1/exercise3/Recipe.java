package academy.everyonecodes.java.week2.set1.exercise3;

import java.util.List;

public class Recipe {
    private String name;
    private int duration;
    private List<String> ingredients;
    private List<String> steps;

    public Recipe(String name, int duration, List<String> ingredients, List<String> steps) {
        this.name = name;
        this.duration = duration;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }
}


