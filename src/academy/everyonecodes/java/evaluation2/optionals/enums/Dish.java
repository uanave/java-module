package academy.everyonecodes.java.evaluation2.optionals.enums;

import java.util.Objects;

public class Dish {
    private String name;
    private Category category;
    private double price;

    public Dish(String name, Category category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Double.compare(dish.price, price) == 0 &&
                Objects.equals(name, dish.name) &&
                category == dish.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, price);
    }
}
