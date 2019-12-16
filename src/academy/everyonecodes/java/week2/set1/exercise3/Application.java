package academy.everyonecodes.java.week2.set1.exercise3;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> ingredients = List.of("eggs", "cheese", "green onions", "milk", "oil");
        List<String> steps = List.of("beat the eggs", "cut onions", "mix ingredients", "cook in pan");
        Recipe omlette = new Recipe("Omlet", 15, ingredients, steps);
        System.out.println("Today I will cook " + omlette.getName());
    }
}
