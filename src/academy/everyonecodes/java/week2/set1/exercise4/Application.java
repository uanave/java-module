package academy.everyonecodes.java.week2.set1.exercise4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Application {
    private static void explain(Menu menu) {
        System.out.println("These are the available dishes on the menu:");
        for (Dish dish : menu.getDishes()) {
            System.out.println(dish.getName() + " for " + dish.getPrice() + " Euro.");
        }
    }

    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
        Dish pizza = new Dish("Pizza", 12.4);
        Dish pasta = new Dish("Pasta", 9.3);
        Dish salad = new Dish("Salad", 5.9);
        dishes.add(pizza);
        dishes.add(pasta);
        dishes.add(salad);
        Menu menuAlfredo = new Menu("alfredo", dishes);
        explain(menuAlfredo);
    }
}

