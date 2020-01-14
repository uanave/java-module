package academy.everyonecodes.java.week4.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DoubleListFromMedianSubtractorTest {
    DoubleListFromMedianSubtractor doubleListFromMedianSubtractor = new DoubleListFromMedianSubtractor();

    @Test
    void calculateList1() {
        List<Double> input = List.of(1.0, 4.0, 2.0, 10.0, 11.5);

        List<Double> expected = List.of(-3.0, 0.0, -2.0, 6.0, 7.5);

        List<Double> result = doubleListFromMedianSubtractor.calculate(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateList2() {
        List<Double> input = List.of(5.0, 7.0, 1.0, 8.0, 2.5);

        List<Double> expected = List.of(0.0, 2.0, -4.0, 3.0, -2.5);

        List<Double> result = doubleListFromMedianSubtractor.calculate(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateList3() {
        List<Double> input = List.of(0.0, 5.0, 6.0, 8.5, 6.5);

        List<Double> expected = List.of(-6.0, -1.0, 0.0, 2.5, 0.5);

        List<Double> result = doubleListFromMedianSubtractor.calculate(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateList4() {
        List<Double> input = List.of();

        List<Double> expected = List.of();

        List<Double> result = doubleListFromMedianSubtractor.calculate(input);
        Assertions.assertEquals(expected, result);
    }
}
