package academy.everyonecodes.java.week8.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class WaiterTest {
    Waiter waiter = new Waiter();

    static Stream<Arguments> parameters() {

        return Stream.of(
                Arguments.of(List.of("Fork", "Knife"), "Fish"),
                Arguments.of(List.of(), "IceCream"),
                Arguments.of(List.of("Fork"), "Pasta"),
                Arguments.of(List.of("Spoon"), "Soup"),
                Arguments.of(List.of(), "")

        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void getCutlery(List<String> expected, String dish) {
        List<String> result = waiter.getCutlery(dish);
        Assertions.assertEquals(expected, result);
    }

}