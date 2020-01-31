package academy.everyonecodes.java.week5.set2.exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class IntegerToListConverterTest {
    IntegerListToStringConverter integerListToStringConverter = new IntegerListToStringConverter();

    @Test
    void convertNumbers() {
        List<Integer> numbers = List.of(1, 2, 3);

        List<String> result = integerListToStringConverter.convert(numbers);

        List<String> expected = List.of("1", "2", "3");
        Assertions.assertEquals(expected, result);
    }

    @Test
    void convertSingleNumber() {
        List<Integer> numbers = List.of(-1);

        List<String> result = integerListToStringConverter.convert(numbers);

        List<String> expected = List.of("-1");
        Assertions.assertEquals(expected, result);
    }

    @Test
    void convertEmpty() {
        List<Integer> numbers = List.of();

        List<String> result = integerListToStringConverter.convert(numbers);

        List<String> expected = List.of();
        Assertions.assertEquals(expected, result);
    }
}
