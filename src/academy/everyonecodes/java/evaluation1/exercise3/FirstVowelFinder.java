package academy.everyonecodes.java.evaluation1.exercise3;

import java.util.List;
import java.util.Optional;

public class FirstVowelFinder {
    public Optional<String> find(String input) {
        List<String> vowels = List.of("a", "e", "i", "o", "u");
        List<String> inputAsList = List.of(input.split(""));
        for (String letter : inputAsList) {
            for (String vowel : vowels) {
                if (letter.equals(vowel)) {
                    return Optional.of(letter);
                }
            }
        }
        return Optional.empty();
    }
}
