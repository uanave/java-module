package academy.everyonecodes.java.week8.set2.exercise3.operators;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {
    Sum sum = new Sum();

    @ParameterizedTest
    @CsvSource({
            "23.5, 23, 0.5",
            "0, 0, 0",
            "-4, -2, -2"
    })
    void test(double expected, double number1, double number2) {
        double result = sum.operate(number1, number2);
        assertEquals(expected, result);
    }

}