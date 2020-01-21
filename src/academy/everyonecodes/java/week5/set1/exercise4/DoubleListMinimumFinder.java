package academy.everyonecodes.java.week5.set1.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DoubleListMinimumFinder {
    public Optional<Double> find(List<Double> numbers) {
        List<Double> inputCopy = new ArrayList<>(numbers);
        Collections.sort(inputCopy);
        if (numbers.size() > 0) {
            return Optional.of(inputCopy.get(0));
        } else {
            return Optional.empty();
        }
    }
}
