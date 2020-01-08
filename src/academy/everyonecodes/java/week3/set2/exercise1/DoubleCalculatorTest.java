package academy.everyonecodes.java.week3.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DoubleCalculatorTest {
    DoubleCalculator doubleCalculator = new DoubleCalculator();

    @ParameterizedTest
    @CsvSource({
            "9.1, 3.5, 5.6",
            "2.4, 0.5, 1.9",
            "-1.5, 0.0, -1.5"
    })
    void sumDouble(double expected, double input1, double input2) {
        double result = doubleCalculator.sumDouble(input1, input2);

        Assertions.assertEquals(expected, result);
    }
}
