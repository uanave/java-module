package academy.everyonecodes.java.evaluation1.exercise4;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileWriterTest {
    FileWriter fileWriter = new FileWriter();
    FileReader fileReader = new FileReader();
    String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/cats.txt";

    @Test
    void write() {
        List<String> input = List.of("cat", "cow");

        fileWriter.write(contentRootPath, input);

        List<String> inputList = fileReader.read(contentRootPath);

        List<String> expected = List.of("cat", "cow");
        Assertions.assertEquals(expected, inputList);
        System.out.println(inputList);
    }
}
