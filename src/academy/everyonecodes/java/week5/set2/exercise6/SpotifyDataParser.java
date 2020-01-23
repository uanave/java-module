package academy.everyonecodes.java.week5.set2.exercise6;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class SpotifyDataParser {
    public Optional<Song> parseLine(String song) {
        List<String> songAsString = List.of(song.split(",", -1));
        String title = songAsString.get(1);
        String artist = songAsString.get(2);
        try {
            int rank = Integer.parseInt(songAsString.get(0));
            return Optional.of(new Song(title, rank, artist));
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            return Optional.empty();
        }
    }
}
