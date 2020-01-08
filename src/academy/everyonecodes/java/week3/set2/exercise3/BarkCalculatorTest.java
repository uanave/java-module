package academy.everyonecodes.java.week3.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BarkCalculatorTest {
    BarkCalculator barkCalculator = new BarkCalculator();

    @ParameterizedTest
    @CsvSource({
            "1, 0",
            "2, 1"
    })

    void calculate(int expected, int input) {
        int result = barkCalculator.calculate(input);

        Assertions.assertEquals(expected, result);
    }
}
