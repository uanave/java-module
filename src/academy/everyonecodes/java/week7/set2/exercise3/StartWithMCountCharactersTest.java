package academy.everyonecodes.java.week7.set2.exercise3;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StartWithMCountCharactersTest {

    @Test
    void test() {
        int result = Stream.of("Mary", "Joe", "Max", "Laura")
                .filter(name -> name.startsWith("M"))
                .map(String::length)
                .reduce(0, Integer::sum);

        int expected = 7;
        assertEquals(expected, result);
    }
}
