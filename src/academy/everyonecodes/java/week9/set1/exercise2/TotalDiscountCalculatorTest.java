package academy.everyonecodes.java.week9.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class TotalDiscountCalculatorTest {
    TotalDiscountCalculator totalDiscountCalculator = new TotalDiscountCalculator();

    static Stream<Arguments> arguments() {
        List<Product> wineVeggies = List.of(new Product("wine", 10), new Product("tomato", 10));
        List<Product> wineCandy = List.of(new Product("wine", 10), new Product("candy", 7));
        List<Product> breadAndCheese = List.of(new Product("bread", 2), new Product("cheese", 4));

        return Stream.of(
                Arguments.of(18.5, wineVeggies),
                Arguments.of(16.009999999999998, wineCandy),
                Arguments.of(6, breadAndCheese)

        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void test(double expected, List<Product> products) {
        double result = totalDiscountCalculator.calculate(products);
        Assertions.assertEquals(expected, result);
    }
}