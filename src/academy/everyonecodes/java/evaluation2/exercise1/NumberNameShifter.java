package academy.everyonecodes.java.evaluation2.exercise1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NumberNameShifter {

    private NumberNamesDictionary dictionary = new NumberNamesDictionary();

    public List<String> shift(List<String> numberNames) {
        return numberNames.stream()
                .map(number -> dictionary.getNumber(number))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(number -> number + 1)
                .map(number -> dictionary.getName(number))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }
}
