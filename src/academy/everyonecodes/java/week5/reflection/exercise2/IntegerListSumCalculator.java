package academy.everyonecodes.java.week5.reflection.exercise2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class IntegerListSumCalculator {
    public Optional<Integer> sum(List<Integer> numbers) {
        int sum = 0;
        if (numbers.size() > 0) {
            for (int number : numbers) {
                sum += number;
            }
            return Optional.of(sum);
        }
        return Optional.empty();
    }
}
