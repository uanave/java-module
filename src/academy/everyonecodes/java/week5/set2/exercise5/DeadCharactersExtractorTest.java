package academy.everyonecodes.java.week5.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DeadCharactersExtractorTest {
    DeadCharactersExtractor deadCharactersExtractor = new DeadCharactersExtractor();
    String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/got-characters.csv";
    FileReader fileReader = new FileReader();
    String expectedDeaths = "src/academy/everyonecodes/java/week5/set2/files/deaths_expected.txt";

    @Test
    void extract() {
        List<String> expected = fileReader.read(expectedDeaths);

        List<String> result = deadCharactersExtractor.extract(contentRootPath);
        Assertions.assertEquals(expected, result);
        Assertions.assertEquals(expected.size(), result.size());
    }
}
