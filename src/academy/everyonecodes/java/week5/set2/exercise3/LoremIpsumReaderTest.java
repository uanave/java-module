package academy.everyonecodes.java.week5.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class LoremIpsumReaderTest {
    LoremIpsumReader loremIpsumReader = new LoremIpsumReader();
    String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/lorem-ipsum.txt";

    @Test
    void readAll() {
        List<String> result = loremIpsumReader.read(contentRootPath);

        List<String> expected = List.of("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        Assertions.assertEquals(expected, result);
        System.out.println(result);
    }

    @Test
    void readFirstLine() {
        List<String> results = loremIpsumReader.read(contentRootPath);

        String firstLine = results.get(0);

        String expected = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        Assertions.assertEquals(expected, firstLine);
    }

    @Test
    void readLastLine() {
        List<String> results = loremIpsumReader.read(contentRootPath);

        String lastLine = results.get(3);

        String expected = "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        Assertions.assertEquals(expected, lastLine);
    }

    @Test
    void readSize() {
        List<String> results = loremIpsumReader.read(contentRootPath);

        int size = results.size();

        int expected = 4;
        Assertions.assertEquals(expected, size);
    }
}
