package academy.everyonecodes.java.week7.set2.exercise4;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AnimalsContainsTest {
    private FileReader fileReader = new FileReader();
    private StreamFileReader streamFileReader = new StreamFileReader();
    private FileLineAppender fileLineAppender = new FileLineAppender();
    private String output = "src/academy/everyonecodes/java/week7/set2/Files/animals-s.txt";

    @Test
    void test() {
        String input = "src/academy/everyonecodes/java/week7/set2/Files/animals.txt";
        streamFileReader.readLines(input)
                .filter(animal -> animal.contains("s") || animal.contains("S"))
                .map(String::toUpperCase)
                .forEach(animal -> fileLineAppender.append(output, animal));

        List<String> result = fileReader.read(output);

        String expected = "src/academy/everyonecodes/java/week7/set2/Files/animals-s_expected.txt";
        List<String> expectedLines = fileReader.read(expected);
        Assertions.assertEquals(expectedLines, result);
    }

    @AfterEach
    void delete() {
        String output = "src/academy/everyonecodes/java/week7/set2/Files/animals-s.txt";
        Path path = Path.of(output);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
