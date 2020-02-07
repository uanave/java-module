package academy.everyonecodes.java.week7.set2.exercise4;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileLineAppenderTest {
    String path = "src/academy/everyonecodes/java/week7/set2/Files/appended.txt";
    private FileLineAppender fileLineAppender = new FileLineAppender();
    private FileReader fileReader = new FileReader();

    @Test
    void append() {
        String input1 = "WHAT";
        String input2 = "NO";

        fileLineAppender.append(path, input1);
        fileLineAppender.append(path, input2);

        List<String> inputList = fileReader.read(path);

        List<String> expected = List.of("WHAT", "NO");
        assertEquals(expected, inputList);
    }

    @AfterEach
    void deleteNewNameFile() {
        try {
            Files.deleteIfExists(Path.of(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
