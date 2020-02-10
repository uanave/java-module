package academy.everyonecodes.java.optionals.Maps.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringsToLengthMapperTest {
    StringsToLengthMapper stringsToLengthMapper = new StringsToLengthMapper();

    private static Stream<Arguments> provide() {
        return Stream.of(
                Arguments.of(Map.of("cat", 3, "cow", 3), List.of("cat", "cow")),
                Arguments.of(Map.of(), List.of())
                //Arguments.of(Map.of("cat", 3, "cat", 3), List.of("cat", "cat"))
        );
    }

    @ParameterizedTest
    @MethodSource("provide")
    void testNonValid(Map<String, Integer> expected, List<String> input) {
        Map<String, Integer> result = stringsToLengthMapper.map(input);
        assertEquals(expected, result);
    }
}