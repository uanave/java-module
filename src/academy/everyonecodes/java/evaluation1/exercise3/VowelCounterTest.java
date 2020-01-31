package academy.everyonecodes.java.evaluation1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class VowelCounterTest {
    VowelCounter vowelCounter = new VowelCounter();

    @ParameterizedTest
    @CsvSource({
            "3, elephant",
            "0, brrrrr",
            "5, aeiou",
            "0, 234567"
    })
    void count(int expected, String input) {

        int result = vowelCounter.count(input);

        Assertions.assertEquals(expected, result);
    }

}