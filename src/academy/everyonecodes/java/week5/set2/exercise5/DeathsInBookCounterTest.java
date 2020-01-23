package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class DeathsInBookCounterTest {
    DeathsInBookCounter deathsInBookCounter = new DeathsInBookCounter();
    GotDataReader gotDataReader = new GotDataReader();
    String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/got-characters.csv";

    @Test
    void readBookThree() {
        List<Character> characters = gotDataReader.read(contentRootPath);

        int bookName = 3;

        Optional<Integer> oResult = deathsInBookCounter.count(characters, bookName);

        int expected = 97;
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void readBookFour() {
        List<Character> characters = gotDataReader.read(contentRootPath);

        int bookName = 4;

        Optional<Integer> oResult = deathsInBookCounter.count(characters, bookName);

        int expected = 27;
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void readNonExistentBook() {
        List<Character> characters = gotDataReader.read(contentRootPath);

        int bookName = 345;

        Optional<Integer> oResult = deathsInBookCounter.count(characters, bookName);
        Assertions.assertTrue(oResult.isEmpty());
    }
}
