package academy.everyonecodes.java.week4.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StringAsIntegerListParserTest {
    StringAsIntegerListParser stringAsIntegerListParser = new StringAsIntegerListParser();

    @Test
    void parseList1() {
        String input = "1;2;3";

        List<Integer> result = stringAsIntegerListParser.parse(input);

        List<Integer> expected = List.of(1, 2, 3);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void parseList2() {
        String input = "11;22;33";

        List<Integer> result = stringAsIntegerListParser.parse(input);

        List<Integer> expected = List.of(11, 22, 33);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void parseList3() {
        String input = "0;0;7";

        List<Integer> result = stringAsIntegerListParser.parse(input);

        List<Integer> expected = List.of(0, 0, 7);

        Assertions.assertEquals(expected, result);
    }
}
