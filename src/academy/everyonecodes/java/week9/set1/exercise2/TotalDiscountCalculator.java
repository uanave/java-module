package academy.everyonecodes.java.week9.set1.exercise2;

import java.util.List;

public class TotalDiscountCalculator {
    List<Discount> discounts = Discounts.get();

    public double calculate(List<Product> products) {
        Double totalDiscount = discounts.stream()
                .map(discount -> discount.apply(products))
                .reduce(0.0, Double::sum);
        Double totalPrice = products.stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);
        return totalPrice - totalDiscount;
    }
}
