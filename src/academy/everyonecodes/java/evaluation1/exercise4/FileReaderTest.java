package academy.everyonecodes.java.evaluation1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileReaderTest {
    FileReader reader = new FileReader();
    private String path = "src/academy/everyonecodes/java/evaluation1/Files/lines.txt";

    @Test
    void read() {
        List<String> result = reader.read(path);

        List<String> expected = List.of("line 1",
                "line 2",
                "line 3",
                "line 4",
                "line 5",
                "line 6",
                "line 7",
                "line 8",
                "line 9",
                "line 10");

        Assertions.assertEquals(expected, result);
        System.out.println(result);
    }
}
