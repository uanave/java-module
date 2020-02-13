package academy.everyonecodes.java.optionals.Sets.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerListDuplicateRemoverTest {
    IntegerListDuplicateRemover remover = new IntegerListDuplicateRemover();

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3), List.of(1, 2, 3, 1, 2, 3)),
                Arguments.of(List.of(), List.of()),
                Arguments.of(List.of(10), List.of(10)),
                Arguments.of(List.of(-1, 1, -2, 2, 90), List.of(1, 2, 90, -1, -2, -1, 2, 90, 1, -2)),
                Arguments.of(List.of(-1, 1, -2, 2, 90), List.of(1, 2, 90, -1, -2, -1, 2, 90, 1, -2))
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void test(List<Integer> expected, List<Integer> input) {
        List<Integer> result = remover.remove(input);
        assertEquals(expected, result);
    }

}