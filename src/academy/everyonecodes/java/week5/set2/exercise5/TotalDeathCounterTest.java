package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class TotalDeathCounterTest {
    TotalDeathCounter totalDeathCounter = new TotalDeathCounter();
    GotDataReader gotDataReader = new GotDataReader();
    String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/got-characters.csv";

    @Test
    void countGOT() {
        List<Character> characters = gotDataReader.read(contentRootPath);

        Optional<Integer> oResult = totalDeathCounter.count(characters);

        int expected = 307;

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void countList() {
        List<Character> characters = List.of(
                new Character("Adrack Humble", 5, "male"),
                new Character("Talbert Sterry", -1, "male"));

        Optional<Integer> oResult = totalDeathCounter.count(characters);

        int expected = 1;

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void countEmpty() {
        List<Character> characters = List.of();

        Optional<Integer> oResult = totalDeathCounter.count(characters);
        Assertions.assertTrue(oResult.isEmpty());
    }
}
