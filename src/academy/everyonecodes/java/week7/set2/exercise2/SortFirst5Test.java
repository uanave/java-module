package academy.everyonecodes.java.week7.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortFirst5Test {

    @Test
    void test() {
        List<Integer> result = Stream.of(-2, -1, 5, 2, -5, 4)
                .sorted()
                .limit(4)
                .collect(Collectors.toList());

        List<Integer> expected = List.of(-5, -2, -1, 2);
        Assertions.assertEquals(expected, result);
    }
}
