package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class LongestNameFinder {
    public Optional<Character> find(List<Character> characters) {
        List<Integer> nameLengths = new ArrayList<>();
        for (Character person : characters) {
            nameLengths.add(person.getName().length());
        }
        Collections.sort(nameLengths);
        Collections.reverse(nameLengths);
        if (nameLengths.size() > 0) {
            int longestLength = nameLengths.get(0);
            for (Character person : characters) {
                if (person.getName().length() == longestLength) {
                    return Optional.of(person);
                }
            }
        }
        return Optional.empty();
    }
}
