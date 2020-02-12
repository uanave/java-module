package academy.everyonecodes.java.week8.set2.exercise3.operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MultiplicationTest {

    Multiplication multiplication = new Multiplication();

    @ParameterizedTest
    @CsvSource({
            "3, 1, 3",
            "0, 3, 0",
            "50000, 1000, 50",
            "6, -3, -2"
    })
    void test(double expected, double number1, double number2) {
        double result = multiplication.operate(number1, number2);
        Assertions.assertEquals(expected, result);
    }

}