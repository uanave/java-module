package academy.everyonecodes.java.evaluation1.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class IntegerListAverageCalculatorTest {
    IntegerListAverageCalculator integerListAverageCalculator = new IntegerListAverageCalculator();

    @Test
    void calculate() {
        List<Integer> input = List.of(6, 5, 10);

        double result = integerListAverageCalculator.calculate(input);

        double expected = 7.0;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateZero() {
        List<Integer> input = List.of(0, 0, 0, 0);

        double result = integerListAverageCalculator.calculate(input);

        double expected = 0.0;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateNegative() {
        List<Integer> input = List.of(-6, -5, -10);

        double result = integerListAverageCalculator.calculate(input);

        double expected = -7.0;
        Assertions.assertEquals(expected, result);
    }
}
