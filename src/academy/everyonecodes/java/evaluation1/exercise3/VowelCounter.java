package academy.everyonecodes.java.evaluation1.exercise3;

import java.util.List;

public class VowelCounter {
    public int count(String input) {
        int count = 0;
        if (!input.isBlank()) {
            List<String> vowels = List.of("a", "e", "i", "o", "u");
            List<String> inputAsList = List.of(input.split(""));
            for (String letter : inputAsList) {
                if (vowels.contains(letter)) {
                    count++;
                }
            }
        }
        return count;
    }
}
