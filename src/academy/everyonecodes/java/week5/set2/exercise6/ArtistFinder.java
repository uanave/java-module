package academy.everyonecodes.java.week5.set2.exercise6;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class ArtistFinder {
    public Optional<String> readAll(String songName) {
        String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/SpotifyTop50.csv";
        SpotifyDataReader spotifyDataReader = new SpotifyDataReader();
        List<Optional<Song>> songs = spotifyDataReader.read(contentRootPath);
        if (songs.size() > 0) {
            for (Optional<Song> song : songs) {
                if (song.get().getTitle().equals(songName)) {
                    return Optional.of(song.get().getArtist());
                }
            }
        }
        return Optional.empty();
    }
}
