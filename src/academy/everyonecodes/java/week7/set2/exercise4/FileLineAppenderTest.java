package academy.everyonecodes.java.week7.set2.exercise4;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileLineAppenderTest {
    private FileLineAppender FileLineAppender = new FileLineAppender();
    private FileReader fileReader = new FileReader();

    @Test
    void append() {
        String input1 = "WHAT";

        String contentRootPath = "src/academy/everyonecodes/java/week7/set2/Files/appended.txt";
        FileLineAppender.append(contentRootPath, input1);

        String input2 = "NO";

        FileLineAppender.append(contentRootPath, input2);

        List<String> inputList = fileReader.read(contentRootPath);

        List<String> expected = List.of("WHAT", "NO");
        Assertions.assertEquals(expected, inputList);
        System.out.println(inputList);

    }

    @AfterEach
    void deleteNewNameFile() {
        String contentRootPath = "src/academy/everyonecodes/java/week7/set2/Files/appended.txt";
        Path path = Path.of(contentRootPath);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
