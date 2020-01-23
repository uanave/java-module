package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class SpotifyDataParserTest {
    SpotifyDataParser spotifyDataParser = new SpotifyDataParser();

    @Test
    void parseRansom() {
        String line = "7,Ransom,Lil Tecca,trap music,180,64,75,-6,7,23,131,2,29,92;";
        Optional<Song> oResult = spotifyDataParser.parseLine(line);
        Song expected = new Song("Ransom", 7, "Lil Tecca");

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected.getTitle(), oResult.get().getTitle());
        Assertions.assertEquals(expected.getRank(), oResult.get().getRank());
        Assertions.assertEquals(expected.getArtist(), oResult.get().getArtist());
    }

    @Test
    void parseSech() {
        String line = "14,Otro Trago - Remix,Sech,panamanian pop,176,79,73,-2,6,76,288,7,20,87";
        Optional<Song> oResult = spotifyDataParser.parseLine(line);
        Song expected = new Song("Otro Trago - Remix", 14, "Sech");

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected.getTitle(), oResult.get().getTitle());
        Assertions.assertEquals(expected.getRank(), oResult.get().getRank());
        Assertions.assertEquals(expected.getArtist(), oResult.get().getArtist());
    }
    @Test
    void parseEmpty() {
        String line = "14er,Otro Trago - Remix,Sech,panamanian pop,176,79,73,-2,6,76,288,7,20,87";
        Optional<Song> oResult = spotifyDataParser.parseLine(line);

        Assertions.assertTrue(oResult.isEmpty());

    }

}
