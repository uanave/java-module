package academy.everyonecodes.java.week8.reflection.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WaiterTest {
    Waiter waiter = new Waiter();

    private static Stream<Arguments> parameters() {
        List<Cutlery> soup = List.of(new Spoon());
        List<Cutlery> fish = List.of(new Knife(), new Fork());

        return Stream.of(
                Arguments.of(soup, "Soup"),
                Arguments.of(fish, "Fish"),
                Arguments.of(List.of(), "IceCream")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void getCutlery(List<Cutlery> expected, String dish) {
        List<Cutlery> result = waiter.getCutlery(dish);
        System.out.println(result.size());
        assertEquals(expected, result);
    }

}