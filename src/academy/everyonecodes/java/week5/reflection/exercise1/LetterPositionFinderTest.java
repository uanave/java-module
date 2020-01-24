package academy.everyonecodes.java.week5.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

public class LetterPositionFinderTest {
    LetterPositionFinder letterPositionFinder = new LetterPositionFinder();

    @Test
    void findC() {
        String word = "cat";
        String letter = "c";
        Optional<Integer> result = letterPositionFinder.find(word, letter);
        int expected = 0;
        Assertions.assertEquals(expected, result.get());
    }

    @Test
    void findS() {
        String word = "bananas";
        String letter = "s";
        Optional<Integer> result = letterPositionFinder.find(word, letter);
        int expected = 6;
        Assertions.assertEquals(expected, result.get());
    }

    @Test
    void findNonExistentLetter() {
        String word = "horse";
        String letter = "g";
        Optional<Integer> result = letterPositionFinder.find(word, letter);
        Assertions.assertTrue(result.isEmpty());
    }


}
