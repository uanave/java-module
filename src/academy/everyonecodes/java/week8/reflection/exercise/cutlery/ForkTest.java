package academy.everyonecodes.java.week8.reflection.exercise.cutlery;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForkTest {
    Fork fork = new Fork();

    @ParameterizedTest
    @CsvSource({
            "true, Fish",
            "true, Pizza",
            "true, Pasta",
            "false, Soup",
            "false, ''"
    })
    void testFork(boolean expected, String dish) {
        boolean result = fork.isUsedFor(dish);
        assertEquals(expected, result);
    }

}