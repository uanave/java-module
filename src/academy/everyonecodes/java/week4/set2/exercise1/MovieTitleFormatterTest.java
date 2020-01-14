package academy.everyonecodes.java.week4.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MovieTitleFormatterTest {
    MovieTitleFormatter movieTitleFormatter = new MovieTitleFormatter();

    @ParameterizedTest
    @CsvSource({
            "'The Matrix', 'the matrix'",
            "'Once Upon A Time In America', 'oNCE uPON A tiME IN AMERICA'",
            "'Inception', 'inception'",
            "'', ''"
    })
    void format(String expected, String input) {
        String result = movieTitleFormatter.format(input);

        Assertions.assertEquals(expected, result);
    }

}
