package academy.everyonecodes.java.week6.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DigitSumCalculatorTest {
    DigitSumCalculator digitSumCalculator = new DigitSumCalculator();

    @ParameterizedTest
    @CsvSource({
            "15, 12345",
            "3, 1000010001",
            "17, 248102",
            "12, 1220301012",
            "0, 0"
    })
    void calculate(int expected, int number) {
        int result = digitSumCalculator.calculate(number);

        Assertions.assertEquals(expected, result);
    }

}