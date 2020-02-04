package academy.everyonecodes.java.week7.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartWithMCountCharactersTest {
    @Test
    void test() {
        List<Integer> result = Stream.of("Mary", "Joe", "Max", "Laura")
                .filter(name -> name.startsWith("M"))
                .map(String::length)
                .collect(Collectors.toList());

        List<Integer> expected = List.of(4, 3);
        Assertions.assertEquals(expected, result);
    }
}
