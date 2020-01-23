package academy.everyonecodes.java.week5.set2.exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LoremIpsumReader {
    public List<String> read(String contentRootPath) {
        Path path = Path.of(contentRootPath);
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
