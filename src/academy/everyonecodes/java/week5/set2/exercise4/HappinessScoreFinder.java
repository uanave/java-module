package academy.everyonecodes.java.week5.set2.exercise4;

import java.util.List;
import java.util.Optional;

public class HappinessScoreFinder {
    public Optional<Double> findFor(List<HappinessRecord> worldHappiness, String country) {
        for (HappinessRecord item : worldHappiness) {
            if (item.getCountry().equals(country)) {
                return Optional.of(item.getScore());
            }
        }
        return Optional.empty();
    }
}
