package academy.everyonecodes.java.week8.set2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdvancedThiefTest {
    AdvancedThief advancedThief = new AdvancedThief();

    @ParameterizedTest
    @CsvSource({
            "18, 20",
            "16, 18",
            "0, 2"
    })
    void test(int expected, int input) {
        Safe safe = new Safe(10, input);


        advancedThief.open(safe);
        assertEquals(expected, safe.getDifficultyPoints());
    }
}