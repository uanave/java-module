package academy.everyonecodes.java.week5.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise4.HappinessRecord;

import java.util.List;
import java.util.Optional;

public class GotDataParser {
    public Optional<Character> parseLine(String line) {
        List<String> characterLine = List.of(line.split(";", -1));
        String characterName = characterLine.get(0);
        String gender;
        int book;
        try {
            if (Integer.parseInt(characterLine.get(6)) == 0) {
                gender = "female";
            } else {
                gender = "male";
            }
            String bookOfDeath = characterLine.get(3);
            if (bookOfDeath.length() < 1) {
                book = -1;
            } else {
                book = Integer.parseInt(bookOfDeath);
            }
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
        return Optional.of(new Character(characterName, book, gender));

    }
}
