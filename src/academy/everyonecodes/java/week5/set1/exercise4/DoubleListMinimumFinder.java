package academy.everyonecodes.java.week5.set1.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DoubleListMinimumFinder {
    public Optional<Double> find(List<Double> input) {
        List<Double> inputCopy = new ArrayList<>(input);
        Collections.sort(inputCopy);
        if (input.size() > 0) {
            return Optional.of(inputCopy.get(0));
        } else {
            return Optional.empty();
        }
    }
}
