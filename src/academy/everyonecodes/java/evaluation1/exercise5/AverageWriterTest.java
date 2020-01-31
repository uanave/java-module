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
    private String inputPath = "src/academy/everyonecodes/java/evaluation1/Files/numbers.txt";
    private String outputPath = "src/academy/everyonecodes/java/evaluation1/Files/output.txt";

    @Test
    void write() {
        averageWriter.write(inputPath, outputPath);
        List<String> input = fileReader.read(outputPath);
        List<String> expected = fileReader.read(outputPath);
        Assertions.assertLinesMatch(expected, input);
    }

    @AfterEach
    void delete() {
        Path path = Path.of("src/academy/everyonecodes/java/evaluation1/Files/output.txt");
        try {
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}