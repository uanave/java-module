package academy.everyonecodes.java.week7.set2.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileLineAppender {

    public void append(String contentRootPath, String input) {
        Path path = Path.of(contentRootPath);
        List<String> lines = List.of(input);
        try {
            Files.write(path, lines, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
