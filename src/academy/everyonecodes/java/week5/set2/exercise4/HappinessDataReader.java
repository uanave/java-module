package academy.everyonecodes.java.week5.set2.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HappinessDataReader {
    public List<Optional<HappinessRecord>> read(String contentPath) {
        Path path = Path.of(contentPath);
        List<Optional<HappinessRecord>> countries = new ArrayList<>();
        HappinessDataParser happinessDataParser = new HappinessDataParser();
        try {
            List<String> worldHappiness = Files.readAllLines(path);
            for (String country : worldHappiness) {
                Optional<HappinessRecord> happiness = happinessDataParser.parseLine(country);
                if (happiness.isPresent()) {
                    countries.add(happiness);
                }
            }
            // System.out.println(countries.get(0).get());
            return countries;
        } catch (IOException e) {
            e.printStackTrace();
            return countries;
        }
    }
}
