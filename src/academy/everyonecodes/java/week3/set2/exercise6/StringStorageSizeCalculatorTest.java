package academy.everyonecodes.java.week3.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringStorageSizeCalculatorTest {
    StringStorageSizeCalculator stringStorageSizeCalculator = new StringStorageSizeCalculator();

    @ParameterizedTest
    @CsvSource({
            "176, 'blablabla'",
            "320, 'kfhkfhakfeheakhfka'",
            "32, ''"
    })

    void calculate(int expected, String string) {
        int result = stringStorageSizeCalculator.calculate(string);

        Assertions.assertEquals(expected, result);
    }
}
