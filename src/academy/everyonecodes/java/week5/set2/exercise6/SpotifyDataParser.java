package academy.everyonecodes.java.week5.set2.exercise6;

import java.util.List;
import java.util.Optional;

public class SpotifyDataParser {
    public Optional<Song> parseLine(String song) {
        List<String> songAsStrings = List.of(song.split(",", -1));
        String title = songAsStrings.get(1);
        String artist = songAsStrings.get(2);
        try {
            int rank = Integer.parseInt(songAsStrings.get(0));
            return Optional.of(new Song(title, rank, artist));
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            return Optional.empty();
        }
    }
}
