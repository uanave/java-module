package academy.everyonecodes.java.evaluation2.optionals.enums;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MostExpensiveDishesFinder {
    public List<Optional<Dish>> find(List<Dish> dishes) {
        List<Optional<Dish>> mostExpensive = new ArrayList<>();
        Optional<Dish> maxStarter = dishes.stream()
                .filter(dish -> dish.getCategory().equals(Category.STARTER)).max(Comparator.comparing(Dish::getPrice));
        if (maxStarter.isPresent()) {
            mostExpensive.add(maxStarter);
        }
        Optional<Dish> maxMain = dishes.stream()
                .filter(dish -> dish.getCategory().equals(Category.MAIN_DISH)).max(Comparator.comparing(Dish::getPrice));
        if (maxMain.isPresent()) {
            mostExpensive.add(maxMain);
        }
        Optional<Dish> maxDessert = dishes.stream()
                .filter(dish -> dish.getCategory().equals(Category.DESSERT)).max(Comparator.comparing(Dish::getPrice));
        if (maxDessert.isPresent()) {
            mostExpensive.add(maxDessert);
        }
        return mostExpensive;


    }
}