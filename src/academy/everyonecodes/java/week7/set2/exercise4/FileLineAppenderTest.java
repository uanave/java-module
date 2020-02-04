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
    FileLineAppender FileLineAppender = new FileLineAppender();
    FileReader fileReader = new FileReader();
    String contentRootPath = "src/academy/everyonecodes/java/week7/set2/Files/appended.txt";



    @Test
    void append() {
        List<String> input1 = List.of("WHAT");

        FileLineAppender.append(contentRootPath, input1);

        List<String> input2 = List.of("NO");

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
