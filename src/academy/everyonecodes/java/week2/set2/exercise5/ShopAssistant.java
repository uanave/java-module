package academy.everyonecodes.java.week2.set2.exercise5;

import java.util.ArrayList;
import java.util.List;

public class ShopAssistant {
    public void findShoeForCustomer(ShoeCustomer customer) {
        List<Shoe> shoes = new ArrayList<>();
        shoes.add(new Shoe(39, "pink"));
        shoes.add(new Shoe(40, "red"));
        shoes.add(new Shoe(38, "blue"));
        shoes.add(new Shoe(42, "black"));
        for (Shoe shoe : shoes) {
            boolean shoeFits = customer.tryShoe(shoe);
            if (shoeFits) {
                System.out.println("I will take the " + shoe.getColor() + " one!");
            } else {
                System.out.println("Nope! This one doesn't fit! Sorry!");
            }

        }

    }

}
