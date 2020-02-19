package academy.everyonecodes.java.week9.set2.exercise1;


import academy.everyonecodes.java.week9.set2.exercise1.Units.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChangeUnitsCalculatorTest {
    ChangeUnitsCalculator changeUnitsCalculator = new ChangeUnitsCalculator();

    static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(List.of(new Euro100(), new Euro20()), new BigDecimal(120)),
                Arguments.of(List.of(new Cent50(), new Cent20(), new Cent5()), new BigDecimal("0.75")),
                Arguments.of(List.of(), new BigDecimal(0))
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void test(List<MoneyUnit> expected, BigDecimal input) {
        List<MoneyUnit> result = changeUnitsCalculator.calculate(input);
        assertEquals(expected.hashCode(), result.hashCode());
    }
}