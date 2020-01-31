package academy.everyonecodes.java.evaluation1.exercise5;

import java.util.List;

public class IntegerListAverageCalculator {
    public double calculate(List<Integer> numbers) {
        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }
}
