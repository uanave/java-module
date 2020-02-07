package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamFileReaderTest {
    private StreamFileReader streamFileReader = new StreamFileReader();
    private String path = "src/academy/everyonecodes/java/week7/set2/Files/animals.txt";

    @Test
    void readLines() {
        List<String> result = streamFileReader.readLines(path)
                .collect(Collectors.toList());

        List<String> expected = List.of("Giraffe",
                "Lion",
                "Fish",
                "Tiger",
                "Snake",
                "Dog",
                "Horse",
                "Cat",
                "Snail",
                "Mouse");
        assertEquals(expected, result);
    }
}