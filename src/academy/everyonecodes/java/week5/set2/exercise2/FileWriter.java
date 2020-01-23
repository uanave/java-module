package academy.everyonecodes.java.week5.set2.exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
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

    public void append(String contentRootPath, List<String> input) {
        Path path = Path.of(contentRootPath);
        try {
            Files.write(path, input, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
