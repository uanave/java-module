package academy.everyonecodes.java.week3.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class DoubleListSumCalculatorTest {
    DoubleListSumCalculator doubleListSumCalculator = new DoubleListSumCalculator();

    private static Stream<Arguments> provideLists() {
        return Stream.of(
                Arguments.of(4.0, List.of(1.5, 2.5)),
                Arguments.of(7.5, List.of(1.5, 2.5, 3.5)),
                Arguments.of(1.0, List.of(1.0))
        );
    }

    @ParameterizedTest
    @MethodSource("provideLists")
    void calculate(double expected, List<Double> numbers) {
        double result = doubleListSumCalculator.calculate(numbers);

        Assertions.assertEquals(expected, result);
    }
}
