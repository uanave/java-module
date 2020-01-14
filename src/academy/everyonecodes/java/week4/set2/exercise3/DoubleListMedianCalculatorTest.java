package academy.everyonecodes.java.week4.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DoubleListMedianCalculatorTest {

    @Test
    void calculateOdd() {
        List<Double> input = List.of(3.4, 5.6, 7.8, 0.5, 8.9);

        double expected = 5.6;

        double result = DoubleListMedianCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateEven() {
        List<Double> input = List.of(3.4, 6.2, 7.8, 0.5, 8.9, 11.5);

        double expected = 7.0;

        double result = DoubleListMedianCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateOdd2() {
        List<Double> input = List.of(3.4, 5.6, 7.8, 0.5, 8.9, 11.5, 0.5, 0.9, 1.2);

        double expected = 3.4;

        double result = DoubleListMedianCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateOdd3() {
        List<Double> input = List.of();

        double expected = 0.0;

        double result = DoubleListMedianCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }

}
