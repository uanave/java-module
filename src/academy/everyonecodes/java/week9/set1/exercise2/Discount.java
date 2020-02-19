package academy.everyonecodes.java.week9.set1.exercise2;

import java.util.List;

public class Discount {
    private int discountPercentage;
    private List<String> applicableProductNames;

    public Discount(int percentage, List<String> applicableProductNames) {
        this.discountPercentage = percentage;
        this.applicableProductNames = applicableProductNames;
    }

    public double apply(List<Product> products) {
        return products.stream()
                .filter(product -> applicableProductNames.contains(product.getName()))
                .map(product -> (product.getPrice() - product.getPrice() * (1.0 - discountPercentage/100.0)))
                .reduce(0.0, Double::sum);

//                .filter(product -> applicableProductNames.contains(product.getName()))
//                .map(price -> price.getPrice() * (1.0 - discountPercentage / 100.0))
//                .reduce(0.0, Double::sum);
    }
}

