package academy.everyonecodes.java.week5.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class DoubleListMaximumFinderTest {
    DoubleListMaximumFinder doubleListMaximumFinder = new DoubleListMaximumFinder();

    @Test
    void find() {
        List<Double> input = List.of(2.3, 1.3, 0.8);

        Optional<Double> oResult = doubleListMaximumFinder.find(input);

        double expected = 2.3;

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void findEmpty() {
        List<Double> input = List.of();

        Optional<Double> oResult = doubleListMaximumFinder.find(input);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void findZero() {
        List<Double> input = List.of(-0.0, -1.9, -1.2);

        Optional<Double> oResult = doubleListMaximumFinder.find(input);

        double expected = -0.0;

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }
}
