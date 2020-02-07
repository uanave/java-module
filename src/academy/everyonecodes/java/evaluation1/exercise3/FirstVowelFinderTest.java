package academy.everyonecodes.java.evaluation1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

class FirstVowelFinderTest {
    FirstVowelFinder firstVowelFinder = new FirstVowelFinder();

    @ParameterizedTest
    @CsvSource({
            "a, banana",
            "i, immediately",
            "u, true",
            "o, boa",
    })
    void find(String expected, String input) {
        Optional<String> oResult = firstVowelFinder.find(input);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());

    }

    @Test
    void findNonExistent() {
        String input = "pprrrt";
        Optional<String> oResult = firstVowelFinder.find(input);
        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void findEmpty() {
        String input = "";
        Optional<String> oResult = firstVowelFinder.find(input);
        Assertions.assertTrue(oResult.isEmpty());
    }
}