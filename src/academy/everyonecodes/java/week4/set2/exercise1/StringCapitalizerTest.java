package academy.everyonecodes.java.week4.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringCapitalizerTest {
    StringCapitalizer stringCapitalizer = new StringCapitalizer();

    @ParameterizedTest
    @CsvSource({
            "'Cat', 'cat'",
            "'090', '090'",
            "'What', 'what'",
            "'', ''"
    })
    void capitalize(String expected, String input) {
        String result = stringCapitalizer.capitalize(input);

        Assertions.assertEquals(expected, result);
    }
}
