package academy.everyonecodes.java.evaluation1.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileWriter {
    public void write(String contentRootPath, List<String> input) {
        Path path = Path.of(contentRootPath);
        try {
            Files.write(path, input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
