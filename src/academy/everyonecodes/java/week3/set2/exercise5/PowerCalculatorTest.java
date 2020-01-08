package academy.everyonecodes.java.week3.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PowerCalculatorTest {
    PowerCalculator powerCalculator = new PowerCalculator();

    @ParameterizedTest
    @CsvSource({
            "15.625, 2.5, 3",
            "18.49, 4.3, 2",
            "61.46559999999999, 2.8, 4"
    })
    void calculate(double expected, double input1, double input2) {
        double result = powerCalculator.calculate(input1, input2);

        Assertions.assertEquals(expected, result);
    }


}
