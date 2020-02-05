package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class HappinessDataParser {
    public Optional<HappinessRecord> parseLine(String line) {
        List<String> countryLine = List.of(line.split(";"));
        String countryName = countryLine.get(0);
        try {
            int rank = Integer.parseInt(countryLine.get(1));
            double score = Double.parseDouble(countryLine.get(2));
            return Optional.of(new HappinessRecord(countryName, rank, score));
        } catch (NumberFormatException e) {
            // System.out.println(countryLine);
            return Optional.empty();
        }
    }
}
