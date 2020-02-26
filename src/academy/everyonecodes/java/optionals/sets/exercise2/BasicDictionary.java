package academy.everyonecodes.java.evaluation2.optionals.Sets.exercise2;

import java.util.*;
import java.util.stream.Collectors;

public class BasicDictionary {
    Set<String> dictionary = Set.of("hi", "house", "dog", "cat", "table", "chair", "elephant");


    public List<String> findUnknownWords(String words) {
        words = words.toLowerCase();
        Set<String> wordsAsSet = new LinkedHashSet<>(Arrays.asList(words.split(" ")));
        if (!words.isBlank()) {
            return wordsAsSet.stream()
                    .filter(word -> !dictionary.contains(word))
                    .collect(Collectors.toList());
        } else {
            return new ArrayList<>();
        }
    }
}
