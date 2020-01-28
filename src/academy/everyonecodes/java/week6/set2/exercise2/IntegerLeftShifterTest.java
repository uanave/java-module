package academy.everyonecodes.java.week6.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class IntegerLeftShifterTest {
    IntegerLeftShifter integerLeftShifter = new IntegerLeftShifter();

    @Test
    void shiftList() {
        List<Integer> input = List.of(1, 2, 3, 4, 5);

        List<Integer> result = integerLeftShifter.shiftOne(input);

        List<Integer> expected = List.of(2, 3, 4, 5, 1);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void shiftEmpty() {
        List<Integer> input = List.of();

        List<Integer> result = integerLeftShifter.shiftOne(input);

        List<Integer> expected = List.of();
        Assertions.assertEquals(expected, result);
    }
    @Test
    void shiftOne() {
        List<Integer> input = List.of(1);

        List<Integer> result = integerLeftShifter.shiftOne(input);

        List<Integer> expected = List.of(1);
        Assertions.assertEquals(expected, result);
    }
}