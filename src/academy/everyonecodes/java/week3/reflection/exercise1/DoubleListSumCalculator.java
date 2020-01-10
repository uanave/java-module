package academy.everyonecodes.java.week3.reflection.exercise1;

import java.util.List;

public class DoubleListSumCalculator {
    public double calculate(List<Double> numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}
