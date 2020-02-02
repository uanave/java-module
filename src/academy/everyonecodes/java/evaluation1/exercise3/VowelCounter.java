package academy.everyonecodes.java.evaluation1.exercise3;

import java.util.List;

public class VowelCounter {
    List<String> vowels = List.of("a", "e", "i", "o", "u");

    public int count(String input) {
        List<String> inputAsList = List.of(input.split(""));
        int count = 0;
        if (!input.isBlank()) {
            for (String letter : inputAsList) {
                if (vowels.contains(letter)) {
                    count++;
                }
            }
        }
        return count;
    }
}
