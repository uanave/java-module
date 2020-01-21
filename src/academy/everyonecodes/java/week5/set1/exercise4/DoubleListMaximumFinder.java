package academy.everyonecodes.java.week5.set1.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DoubleListMaximumFinder {
    public Optional<Double> find(List<Double> numbers) {
        List<Double> numbersCopy = new ArrayList<>(numbers);
        Collections.sort(numbersCopy);
        if (numbers.size() > 0) {
            return Optional.of(numbersCopy.get(numbersCopy.size() - 1));
        } else {
            return Optional.empty();
        }
    }
}
