package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class SpotifyDataReaderTest {
    SpotifyDataReader spotifyDataReader = new SpotifyDataReader();
    String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/SpotifyTop50.csv";

    @Test
    void readFirst() {
        List<Optional<Song>> songs = spotifyDataReader.read(contentRootPath);
        Song expected = new Song("\"Señorita\"", 1, "\"Shawn Mendes\"");
        Optional<Song> oResult = songs.get(0);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected.getTitle(), oResult.get().getTitle());
        Assertions.assertEquals(expected.getRank(), oResult.get().getRank());
        Assertions.assertEquals(expected.getArtist(), oResult.get().getArtist());
    }

    @Test
    void readLast() {
        List<Optional<Song>> songs = spotifyDataReader.read(contentRootPath);
        Song expected = new Song("\"Talk\"", 44, "\"Khalid\"");
        Optional<Song> oResult = songs.get(43);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected.getTitle(), oResult.get().getTitle());
        Assertions.assertEquals(expected.getRank(), oResult.get().getRank());
        Assertions.assertEquals(expected.getArtist(), oResult.get().getArtist());
    }
    @Test
    void readSize() {
        List<Optional<Song>> songs = spotifyDataReader.read(contentRootPath);

        int expected = 50;

        Assertions.assertEquals(expected, songs.size());
    }

}
