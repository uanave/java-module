package academy.everyonecodes.java.week5.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

public class StringOverlapFinderTest {
    StringOverlapFinder stringOverlapFinder = new StringOverlapFinder();

    @ParameterizedTest
    @CsvSource({
            "el, michael, elias",
            "oat, boat, oatmeal",
            "le, bottle, Leopard",
            "'', banana, lame",
            "'', '', what",
            "ana, ana, ana",
            "my, my, myPhone"
    })
    void find(String expected, String inputOne, String inputTwo) {
        Optional<String> oResult = stringOverlapFinder.find(inputOne, inputTwo);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }
}
