package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KnifeTest {
    Knife knife = new Knife();

    @ParameterizedTest
    @CsvSource({
            "true, Fish",
            "true, Pizza",
            "false, pizza",
            "false, Soup",
            "false, ''"
    })
    void testKnife(boolean expected, String dish) {
        boolean result = knife.isUsedFor(dish);
        assertEquals(expected, result);
    }

}