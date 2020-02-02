package academy.everyonecodes.java.evaluation1.exercise5;

import java.util.List;
import java.util.Optional;

public class IntegerListAverageCalculator {
    public Optional<Double> calculate(List<Integer> numbers) {
        if (numbers.size() == 0) {
            return Optional.empty();
        }
        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return Optional.of(sum / numbers.size());
    }
}
