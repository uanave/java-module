package academy.everyonecodes.java.week8.reflection.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KnifeTest {
    Knife knife = new Knife();

    @ParameterizedTest
    @CsvSource({
            "true, Fish",
            "true, Pizza",
            "false, Soup",
    })
    void testKnife(boolean expected, String dish) {
        boolean result = knife.isUsedFor(dish);
        assertEquals(expected, result);
    }

}