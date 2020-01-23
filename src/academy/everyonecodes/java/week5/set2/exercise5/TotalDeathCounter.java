package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class TotalDeathCounter {
    public Optional<Integer> count(List<Character> characters) {
        int deaths = 0;
        try {
            if (characters.size() > 0) {
                for (Character person : characters) {
                    if (person.getBookOfDeath() != -1) {
                        deaths++;
                    }
                }
                return Optional.of(deaths);
            } else {
                return Optional.empty();
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
