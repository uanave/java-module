package academy.everyonecodes.java.week5.reflection.exercise1;

import java.util.Optional;

public class LetterPositionFinder {
    public Optional<Integer> find(String word, String letter) {
        for (int i = 0, j = 1; i < word.length(); i++, j++) {
            String character = word.substring(i, j);
            try {
                if (character.equals(letter)) {
                    return Optional.of(i);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return Optional.empty();
    }
}
