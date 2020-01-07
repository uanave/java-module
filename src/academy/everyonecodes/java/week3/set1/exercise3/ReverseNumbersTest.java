package academy.everyonecodes.java.week3.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseNumbersTest {
    ReverseNumbers reverseNumbers = new ReverseNumbers();

    @Test
    void reverse() {
        int[] input = {1, 2, 3, 4};

        int[] result = reverseNumbers.reverse(input);

        int[] expected = {4, 3, 2, 1};
        Assertions.assertArrayEquals(expected, result);
    }
}