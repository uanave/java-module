package academy.everyonecodes.java.evaluation1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FileContentReverserTest {
    FileContentReverser fileContentReverser = new FileContentReverser();

    FileReader fileReader = new FileReader();
    FileWriter fileWriter = new FileWriter();
    String input = "src/academy/everyonecodes/java/evaluation1/Files/lines.txt";
    String output = "src/academy/everyonecodes/java/evaluation1/Files/lines-reversed.txt";
    String expected = "src/academy/everyonecodes/java/evaluation1/Files/lines-reversed_expected.txt";

    @Test
    void write() {
        fileContentReverser.reverse(input, output);
        List<String> lines = fileReader.read(output);
        List<String> expectedLines = fileReader.read(expected);
        Assertions.assertLinesMatch(expectedLines, lines);
    }

}