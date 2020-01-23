package academy.everyonecodes.java.week5.set2.exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LineLengthReaderTest {
    LineLengthReader lineLengthReader = new LineLengthReader();

    String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/strings.txt";

    @Test
    void readFirst() {
        List<Integer> results = lineLengthReader.read(contentRootPath);

        int expected = 86;
        Assertions.assertEquals(expected, results.get(0));
    }

    @Test
    void readLast() {
        List<Integer> results = lineLengthReader.read(contentRootPath);

        int expected = 66;
        Assertions.assertEquals(expected, results.get(119));
    }

    @Test
    void checkSize() {
        List<Integer> results = lineLengthReader.read(contentRootPath);

        int sizeExpected = 120;
        Assertions.assertEquals(sizeExpected, results.size());
    }
}
