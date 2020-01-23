package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class DeathsInBookCounter {
    public int count(List<Character> characters, int bookName) {
        int deaths = 0;
        try {
            for (Character person : characters) {
                int book = person.getBookOfDeath();
                if (book == bookName) {
                    deaths++;
                }
            }
            return deaths;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return deaths;
        }
    }
}
