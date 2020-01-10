package academy.everyonecodes.java.week3.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class DoubleListSumCalculatorTest {
    DoubleListSumCalculator doubleListSumCalculator = new DoubleListSumCalculator();

    private static Stream<Arguments> generateArgumentsStream() {
        List<Arguments> listOfArguments = new LinkedList<>();
        listOfArguments.add(Arguments.of(generateArgumentsStream(4, (1.5, 2.5))));
        listOfArguments.add(Arguments.of(generateArgumentsStream(7.5, (1.5, 2.5, 3.5))));
        return listOfArguments.stream();
    }


    @ParameterizedTest
    @MethodSource("generateArgumentStream")
    void calculate(double expected, List<Double> numbers) {
        double result = doubleListSumCalculator.calculate(numbers);

        Assertions.assertEquals(expected, result);
    }
}
