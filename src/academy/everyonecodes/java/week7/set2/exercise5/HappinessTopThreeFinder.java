package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessTopThreeFinder {
    private HappinessDataReader happinessDataReader = new HappinessDataReader();

    public List<String> findTopThree() {
        List<HappinessRecord> happinessRecords = happinessDataReader.read();
        return happinessRecords.stream()
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(3)
//                .map(record -> "Country: " + record.getCountry() + ", score: " + record.getScore())
                .map(HappinessRecord::toString)
                .collect(Collectors.toList());
    }
}
