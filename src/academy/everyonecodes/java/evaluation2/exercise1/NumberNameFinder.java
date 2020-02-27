package academy.everyonecodes.java.evaluation2.exercise1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NumberNameFinder {

    private NumberNamesDictionary dictionary = new NumberNamesDictionary();

    public Optional<String> find(List<String> numberNames) {
        return numberNames.stream()
                .map(number -> dictionary.getNumber(number))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(number -> dictionary.getName(number))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .findFirst();
    }
}
