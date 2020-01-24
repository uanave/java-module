package academy.everyonecodes.java.week5.reflection.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class IntegerListSumCalculatorTest {
    IntegerListSumCalculator integerListSumCalculator = new IntegerListSumCalculator();

    @Test
    void sumWholeNumbers() {
        List<Integer> input = List.of(1, 2, 3, 4);

        Optional<Integer> oResult = integerListSumCalculator.sum(input);

        int expected = 10;
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void sumNegativeNumbers() {
        List<Integer> input = List.of(-1, -8, -10, -4);

        Optional<Integer> oResult = integerListSumCalculator.sum(input);

        int expected = -23;
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void sumEmptyList() {
        List<Integer> input = List.of();

        Optional<Integer> oResult = integerListSumCalculator.sum(input);

        Assertions.assertTrue(oResult.isEmpty());
    }
}
