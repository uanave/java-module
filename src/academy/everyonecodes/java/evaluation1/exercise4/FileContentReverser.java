package academy.everyonecodes.java.evaluation1.exercise4;

import java.util.Collections;
import java.util.List;

public class FileContentReverser {

    FileReader fileReader = new FileReader();
    FileWriter fileWriter = new FileWriter();
    String input = "src/academy/everyonecodes/java/evaluation1/Files/lines.txt";
    String output = "src/academy/everyonecodes/java/evaluation1/Files/lines-reversed.txt";

    public void reverse(String input, String output) {
        List<String> inputAsLines = fileReader.read(input);
        Collections.reverse(inputAsLines);
        fileWriter.write(output, inputAsLines);
    }
}
