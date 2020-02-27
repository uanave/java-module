package academy.everyonecodes.java.evaluation2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberNameShifterTest {
    NumberNameShifter numberNameShifter = new NumberNameShifter();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of("two", "four", "five"), List.of("one", "three", "four", "nine")),
                Arguments.of(List.of("two"), List.of("one", "ten", "minus one")),
                Arguments.of(List.of("one"), List.of("zero")),
                Arguments.of(List.of(), List.of("nine")),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void test(List<String> expected, List<String> input) {
        List<String> result = numberNameShifter.shift(input);
        assertEquals(expected, result);
    }

}