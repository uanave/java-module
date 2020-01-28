package academy.everyonecodes.java.week6.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SpecialNumbersCounterTest {
    SpecialNumbersCounter specialNumbersCounter = new SpecialNumbersCounter();

    @ParameterizedTest
    @CsvSource({
            "3, 95637",
            "0, 785410",
            "2, 6598007",
            "2, 1335",
            "0, 1200000",
            "0, 0"
    })
    void count(int expected, int number) {
        int result = specialNumbersCounter.count(number);
        Assertions.assertEquals(expected, result);
    }

}