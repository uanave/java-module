package academy.everyonecodes.java.week4.reflection.exercise1;

import academy.everyonecodes.java.week4.set1.exercise4.FilmCharacter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

class MaxOrMinPickerTest {
    MaxOrMinPicker maxOrMinPicker = new MaxOrMinPicker();

    @Test()
    void pick() {
        List<Integer> input = List.of(1, 2, 3, 4);
        int result = maxOrMinPicker.pick(input);

        boolean expected = input.contains(result);

        Assertions.assertTrue(expected);
    }


}


