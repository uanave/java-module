package academy.everyonecodes.java.week8.set2.exercise3.operators;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisionTest {
    Division division = new Division();

    @ParameterizedTest
    @CsvSource({
            "1, 3, 3",
            "3, 9, 3",
            "7.5, 15, 2",
            "3, -6, -2",
    })
    void test(double expected, double number1, double number2) {
        double result = division.operate(number1, number2);
        assertEquals(expected, result);
    }

}