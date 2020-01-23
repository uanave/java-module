package academy.everyonecodes.java.week5.set2.exercise7;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;

import java.util.ArrayList;
import java.util.List;

public class LineLengthReader {
    public List<Integer> read(String contentRootPath) {
        FileReader fileReader = new FileReader();
        List<String> input = fileReader.read(contentRootPath);
        List<Integer> inputAsInt = new ArrayList<>();
        for (String line : input) {
            inputAsInt.add(line.length());
        }
        return inputAsInt;
    }
}
