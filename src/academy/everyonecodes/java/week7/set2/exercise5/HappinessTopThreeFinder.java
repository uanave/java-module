package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HappinessTopThreeFinder {
    HappinessDataReader happinessDataReader = new HappinessDataReader();

    public List<String> findTopThree() {
        List<Optional<HappinessRecord>> happinessRecords = happinessDataReader.read();
        List<String> topThreeCountries = happinessRecords.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(3)
                .map(HappinessRecord::toString)
                .collect(Collectors.toList());
        return topThreeCountries;
    }
}
