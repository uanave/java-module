package academy.everyonecodes.java.week6.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class IntegerRightShifterTest {
    IntegerRightShifter integerRightShifter = new IntegerRightShifter();

    @Test
    void shiftTwo() {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        List<Integer> result = integerRightShifter.shiftTwo(input);
        List<Integer> expected = List.of(4, 5, 1, 2, 3);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shiftEmpty() {
        List<Integer> input = List.of();
        List<Integer> result = integerRightShifter.shiftTwo(input);
        List<Integer> expected = List.of();
        Assertions.assertEquals(expected, result);
    }

}