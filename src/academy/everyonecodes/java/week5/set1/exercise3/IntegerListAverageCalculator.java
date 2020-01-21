package academy.everyonecodes.java.week5.set1.exercise3;

import java.util.List;
import java.util.Optional;

public class IntegerListAverageCalculator {
    public Optional<Double> calculate(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return Optional.empty();
        } else {
            double sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }
            return Optional.of(sum / numbers.size());
        }
    }
}
