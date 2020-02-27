package academy.everyonecodes.java.evaluation2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberNameFinderTest {
    NumberNameFinder finder = new NumberNameFinder();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.of("ZERO"), List.of("one", "three", "zero", "nine")),
                Arguments.of(Optional.of("THREE"), List.of("one", "three", "ten")),
                Arguments.of(Optional.of("NINE"), List.of("nine", "eight", "four")),
                Arguments.of(Optional.of("SIX"), List.of("six", "fourteen", "hundred")),
                Arguments.of(Optional.of("FOUR"), List.of("four")),
                Arguments.of(Optional.empty(), List.of("thirteen")),
                Arguments.of(Optional.empty(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void test(Optional<String> expected, List<String> input) {
        Optional<String> result = finder.find(input);
        System.out.println(result);

        assertEquals(expected.hashCode(), result.hashCode());
    }

}