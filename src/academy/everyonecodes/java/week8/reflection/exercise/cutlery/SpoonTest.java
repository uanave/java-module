package academy.everyonecodes.java.week8.reflection.exercise.cutlery;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpoonTest {
    Spoon spoon = new Spoon();

    @ParameterizedTest
    @CsvSource({
            "false, Fish",
            "false, Pizza",
            "false, Pasta",
            "true, Soup",
            "false, ''"
    })
    void testKnife(boolean expected, String dish) {
        boolean result = spoon.isUsedFor(dish);
        assertEquals(expected, result);
    }

}