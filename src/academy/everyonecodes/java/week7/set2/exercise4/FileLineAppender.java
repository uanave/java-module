package academy.everyonecodes.java.week7.set2.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileLineAppender {

    public void append(String contentRootPath, String input) {
        Path path = Path.of(contentRootPath);
        try {
            Files.write(path, List.of(input), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
