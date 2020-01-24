package academy.everyonecodes.java.week5.reflection.exercise2;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumWriterTest {
    SumWriter sumWriter = new SumWriter();
    FileReader fileReader = new FileReader();
    String output = "src/academy/everyonecodes/java/week5/reflection/Files/output.csv";

    @Test
    void compare() {
        String expected = "src/academy/everyonecodes/java/week5/reflection/Files/expected.csv";
        List<String> expectedResult = fileReader.read(expected);
        List<String> result = fileReader.read(output);
        Assertions.assertLinesMatch(expectedResult, result);
    }
    @AfterEach
    void delete() {
        Path path = Path.of("src/academy/everyonecodes/java/week5/reflection/Files/output.csv");
        try {
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
