package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class LongestNameFinderTest {
    LongestNameFinder longestNameFinder = new LongestNameFinder();
    GotDataReader gotDataReader = new GotDataReader();
    String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/got-characters.csv";

    @Test
    void findFromPath() {
        List<Character> characters = gotDataReader.read(contentRootPath);

        Optional<Character> oResult = longestNameFinder.find(characters);

        String expected = "Aemon Targaryen (son of Maekar I)";
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get().getName());
    }

    @Test
    void findLongest() {
        List<Character> characters = List.of(
                new Character("Adrack Humble", 5, "male"),
                new Character("Talbert Sterry", 4, "male"));

        Optional<Character> oResult = longestNameFinder.find(characters);

        String expected = "Talbert Sterry";
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get().getName());
    }

    @Test
    void findEmpty() {
        List<Character> characters = List.of();

        Optional<Character> oResult = longestNameFinder.find(characters);

        Assertions.assertTrue(oResult.isEmpty());
    }
}
