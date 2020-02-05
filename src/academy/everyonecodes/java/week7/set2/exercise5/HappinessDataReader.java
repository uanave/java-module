package academy.everyonecodes.java.week7.set2.exercise5;

import academy.everyonecodes.java.week7.set2.exercise4.StreamFileReader;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HappinessDataReader {

    private StreamFileReader streamFileReader = new StreamFileReader();
    private HappinessDataParser happinessDataParser = new HappinessDataParser();

    public List<HappinessRecord> read() {
        String inputPath = "src/academy/everyonecodes/java/week7/set2/Files/world-happiness-2017.csv";
        return streamFileReader.readLines(inputPath)
                .skip(1)
                .map(line -> happinessDataParser.parseLine(line))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }
}
