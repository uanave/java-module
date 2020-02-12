package academy.everyonecodes.java.week8.set2.exercise3.operators;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractionTest {
    Subtraction subtraction = new Subtraction();

    @ParameterizedTest
    @CsvSource({
            "1, 10, 9",
            "0, 0 , 0",
            "4000, 10000, 6000",
            "-3, -9, -6"
    })
    void test(double expected, double number1, double number2) {
        double result = subtraction.operate(number1, number2);
        assertEquals(expected, result);
    }

}