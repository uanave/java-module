package academy.everyonecodes.java.week3.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AbsoluteValueCalculatorTest {
    AbsoluteValueCalculator absoluteValueCalculator = new AbsoluteValueCalculator();

    @ParameterizedTest
    @CsvSource({
            "0.3, -0.3",
            "1.8, -1.8",
            "15.5, -15.5"
    })
    void calculate(double expected, double input) {
        double result = absoluteValueCalculator.calculate(input);

        Assertions.assertEquals(expected, result);
    }
}
