package academy.everyonecodes.java.week8.set2.exercise3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calculator = new Calculator();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.empty(), new Calculation("$", 2, 2)),
                Arguments.of(Optional.of(4.0), new Calculation("+", 2, 2)),
                Arguments.of(Optional.empty(), new Calculation("&", 3, 1))

        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void test(Optional<Double> expected, Calculation calculation) {
        Optional<Double> result = calculator.calculate(calculation);
        System.out.println(expected.hashCode());
        System.out.println(result.hashCode());
        assertEquals(expected.hashCode(), result.hashCode());
    }
}