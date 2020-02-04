package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessSpecialFiveFinder {

    private HappinessDataReader happinessDataReader = new HappinessDataReader();

    public List<String> findSpecialFive() {
        List<HappinessRecord> lines = happinessDataReader.read();
        List<String> result = lines.stream()
                .sorted(Comparator.comparing(HappinessRecord::getRank)
                        .reversed())
                .filter(record -> record.getCountry().contains("a"))
                .filter(record -> record.getCountry().length() > 9)
                .limit(5)
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .map(HappinessRecord::toString)
                .collect(Collectors.toList());
        return result;
    }
}
