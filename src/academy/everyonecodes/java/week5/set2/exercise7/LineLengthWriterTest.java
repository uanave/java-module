package academy.everyonecodes.java.week5.set2.exercise7;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LineLengthWriterTest {
    LineLengthWriter lineLengthWriter = new LineLengthWriter();
    FileReader fileReader = new FileReader();
    String contentWritePath = "src/academy/everyonecodes/java/week5/set2/files/stringlengths.txt";
    String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/strings.txt";
    String expected = "src/academy/everyonecodes/java/week5/set2/files/stringlengths_expected.txt";

    @Test
    void write() {
        lineLengthWriter.write(contentRootPath, contentWritePath);

        List<String> result = fileReader.read(contentWritePath);

        List<String> expectedResult = fileReader.read(expected);
        Assertions.assertEquals(expectedResult, result);
    }
}
