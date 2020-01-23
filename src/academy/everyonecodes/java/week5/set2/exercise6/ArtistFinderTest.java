package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class ArtistFinderTest {
    ArtistFinder artistFinder = new ArtistFinder();

    @Test
    void readRansom() {
        String song = "\"Ransom\"";
        Optional<String> oResult = artistFinder.readAll(song);
        String expected = "\"Lil Tecca\"";

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void readLalala() {
        String song = "\"Lalala\"";
        Optional<String> oResult = artistFinder.readAll(song);
        String expected = "\"Y2K\"";

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void readNonExistentSong() {
        String song = "\"tralala\"";
        Optional<String> oResult = artistFinder.readAll(song);

        Assertions.assertTrue(oResult.isEmpty());
    }
}
