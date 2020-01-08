package academy.everyonecodes.java.week3.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DivisionCalculatorTest {
    DivisionCalculator divisionCalculator = new DivisionCalculator();

    @ParameterizedTest
    @CsvSource({
            "1.9375, 6.2, 3.2",
            "3.707317073170732, 15.2, 4.1",
            "0.0, 0.0, 1.0"
    })

    void divide(double expected, double input1, double input2) {
        double result = divisionCalculator.divide(input1, input2);

        Assertions.assertEquals(expected, result);
    }

}
