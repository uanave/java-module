package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class AddLegTest {
    AddLeg add = new AddLeg();

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(List.of("leg"), new Furniture("table"))
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void test(List<String> expected, Furniture furniture) {
        add.apply(furniture);
        Assertions.assertEquals(expected, furniture.parts);
    }
}