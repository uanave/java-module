package academy.everyonecodes.java.week7.set1.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NotStartWithTLengthTest {

    @Test
    void test() {
        List<Integer> result = Stream.of("Hello", "there", "General", "Kenobi")
                .filter(word -> !word.startsWith("t"))
                .map(word -> word.length())
                .collect(Collectors.toList());

        List<Integer> expected = List.of(5, 7, 6);
        Assertions.assertEquals(expected, result);
    }
}
