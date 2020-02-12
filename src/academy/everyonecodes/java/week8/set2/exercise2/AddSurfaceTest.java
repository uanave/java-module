package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class AddSurfaceTest {
    AddSurface add = new AddSurface();

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("surface", new Furniture("table"))
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void test(String expected, Furniture furniture) {
        add.apply(furniture);
        Assertions.assertEquals(expected, furniture.parts.get(0));
    }

}