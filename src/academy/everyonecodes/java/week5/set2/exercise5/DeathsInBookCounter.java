package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class DeathsInBookCounter {
    public Optional<Integer> count(List<Character> characters, int bookName) {
        Optional<Integer> deathsInBook = Optional.empty();
        try {
            for (Character person : characters) {
                int book = person.getBookOfDeath();
                if(book == bookName) {
                    if (deathsInBook.isPresent()) {
                        deathsInBook = Optional.of(deathsInBook.get() + 1);
                    } else {
                        deathsInBook = Optional.of(1);
                    }
                }
            }
            return deathsInBook;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
