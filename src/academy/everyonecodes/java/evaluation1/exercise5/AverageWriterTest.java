package academy.everyonecodes.java.evaluation1.exercise5;

import academy.everyonecodes.java.evaluation1.exercise4.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class AverageWriterTest {
    private AverageWriter averageWriter = new AverageWriter();
    private FileReader fileReader = new FileReader();
    private String expectedPath = "src/academy/everyonecodes/java/evaluation1/Files/averages_expected.txt";

    @Test
    void write() {
        String outputPath = "src/academy/everyonecodes/java/evaluation1/Files/output.txt";
        String inputPath = "src/academy/everyonecodes/java/evaluation1/Files/numbers.txt";
        averageWriter.write(inputPath, outputPath);
        List<String> input = fileReader.read(outputPath);
        System.out.println(input);
        List<String> expected = fileReader.read(expectedPath);
        System.out.println(expected);
        Assertions.assertLinesMatch(expected, input);
    }

    @AfterEach
    void delete() {
        Path path = Path.of(expectedPath);
        try {
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}