package academy.everyonecodes.java.optionals.Sets.exercise2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BasicDictionary {
    Set<String> dictionary = Set.of("hi", "house", "dog", "cat", "table", "chair", "elephant");

    public List<String> findUnknownWords(String words) {
        Set<String> wordsAsSet = new HashSet<>(Arrays.asList(words.split(" ")));
        return wordsAsSet.stream()
                .map(String::toLowerCase)
                .filter(word -> !dictionary.contains(word))
                .collect(Collectors.toList());
    }

}
