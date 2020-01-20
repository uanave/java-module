package academy.everyonecodes.java.week5.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class IntegerListAverageCalculatorTest {
    IntegerListAverageCalculator integerListAverageCalculator = new IntegerListAverageCalculator();

    @Test
    void calculate() {
        List<Integer> input = List.of(6, 5, 10);

        Optional<Double> oResult = integerListAverageCalculator.calculate(input);

        double expected = 7;

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void calculateZero() {
        List<Integer> input = List.of(0, 0, 0, 0);

        Optional<Double> oResult = integerListAverageCalculator.calculate(input);

        double expected = 0.0;

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void calculateEmpty() {
        List<Integer> input = List.of();

        Optional<Double> oResult = integerListAverageCalculator.calculate(input);

        Assertions.assertTrue(oResult.isEmpty());
    }
}
