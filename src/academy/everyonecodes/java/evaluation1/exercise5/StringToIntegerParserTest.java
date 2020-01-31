package academy.everyonecodes.java.evaluation1.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StringToIntegerParserTest {
    StringToIntegerParser stringToIntegerParser = new StringToIntegerParser();

    @Test
    void parsePositives() {
        String input = "1 2 3 4 5";

        List<Integer> result = stringToIntegerParser.parse(input);

        List<Integer> expected = List.of(1, 2, 3, 4, 5);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void parseNegatives() {
        String input = "-1 -2 -3 -4 -5 -0";

        List<Integer> result = stringToIntegerParser.parse(input);

        List<Integer> expected = List.of(-1, -2, -3, -4, -5, 0);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void parseNonValid() {
        String input = "-1 -2 a -3 -4 -5";

        List<Integer> expected = List.of(-1, -2, -3, -4, -5);

        List<Integer> result = stringToIntegerParser.parse(input);
        Assertions.assertEquals(expected, result);
    }
}
