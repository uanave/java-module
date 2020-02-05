package academy.everyonecodes.java.week7.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamFileReaderTest {
    private StreamFileReader streamFileReader = new StreamFileReader();
    private String path = "src/academy/everyonecodes/java/week7/set2/Files/animals.txt";

    @Test
    void readLines() {
        Stream<String> sResult = streamFileReader.readLines(path);

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

        List<String> result = sResult.collect(Collectors.toList());
        Assertions.assertEquals(expected, result);
    }
}