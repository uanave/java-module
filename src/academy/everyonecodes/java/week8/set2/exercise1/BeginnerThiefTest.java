package academy.everyonecodes.java.week8.set2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeginnerThiefTest {
    BeginnerThief beginnerThief = new BeginnerThief();

    @ParameterizedTest
    @CsvSource({
            "19, 20",
            "1, 2",
            "11, 12",
            "0, 1",
            "-2, -1"
    })
    void test(int expected, int input) {
        Safe safe = new Safe(10, input);

        beginnerThief.open(safe);
        assertEquals(expected, safe.getDifficultyPoints());
    }

}