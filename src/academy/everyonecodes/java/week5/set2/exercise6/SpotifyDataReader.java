package academy.everyonecodes.java.week5.set2.exercise6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SpotifyDataReader {
    List<Optional<Song>> read(String contentRootPath) {
        Path path = Path.of(contentRootPath);
        SpotifyDataParser spotifyDataParser = new SpotifyDataParser();
        List<Optional<Song>> oSongs = new ArrayList<>();
        try {
            List<String> songs = Files.readAllLines(path);
            for (String song : songs) {
                Optional<Song> oneSong = spotifyDataParser.parseLine(song);
                if (oneSong.isPresent()) {
                    oSongs.add(oneSong);
                }
            }
            return oSongs;
        } catch (IOException e){
            e.printStackTrace();
            return oSongs;
        }

    }
}
