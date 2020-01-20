package academy.everyonecodes.java.week5.set1.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DoubleListMaximumFinder {
    public Optional<Double> find(List<Double> input) {
        List<Double> inputCopy = new ArrayList<>(input);
        Collections.sort(inputCopy);
        if (input.size() > 0) {
            return Optional.of(inputCopy.get(inputCopy.size() - 1));
        } else {
            return Optional.empty();
        }
    }
}
