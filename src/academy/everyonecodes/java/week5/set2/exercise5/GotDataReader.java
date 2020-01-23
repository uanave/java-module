package academy.everyonecodes.java.week5.set2.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GotDataReader {
    public List<Character> read(String contentRootPath) {
        GotDataParser gotDataParser = new GotDataParser();
        List<Character> characters = new ArrayList<>();
        Path path = Path.of(contentRootPath);
        try {
            List<String> output = Files.readAllLines(path);
            for (String item : output) {
                Optional<Character> character = gotDataParser.parseLine(item);
                character.ifPresent(characters::add);
            }
            return characters;
        } catch (IOException e) {
            e.printStackTrace();
            return characters;
        }
    }
}
