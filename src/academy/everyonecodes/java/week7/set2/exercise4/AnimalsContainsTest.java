package academy.everyonecodes.java.week7.set2.exercise4;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalsContainsTest {
    FileReader fileReader = new FileReader();
    StreamFileReader streamFileReader = new StreamFileReader();
    FileLineAppender fileLineAppender = new FileLineAppender();
    String input = "src/academy/everyonecodes/java/week7/set2/Files/animals.txt";
    String output = "src/academy/everyonecodes/java/week7/set2/Files/animals-s.txt";
    String expected = "src/academy/everyonecodes/java/week7/set2/Files/animals-s_expected.txt";

    @Test
    void test() {
        List<String> collect = streamFileReader.readLines(input)
                .filter(animal -> animal.contains("s") || animal.contains("S"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        fileLineAppender.append(output, collect);

        List<String> result = fileReader.read(output);

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
