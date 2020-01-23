package academy.everyonecodes.java.week5.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class FileReaderTest {
    FileReader reader = new FileReader();
    private String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/document.txt";

    @Test
    void read() {
        List<String> result = reader.read(contentRootPath);

        List<String> expected = List.of("line 1;part 1-2", "line 2;part 2-2", "line 3;part 3-2");

        Assertions.assertEquals(expected, result);
        System.out.println(result);
    }
}
