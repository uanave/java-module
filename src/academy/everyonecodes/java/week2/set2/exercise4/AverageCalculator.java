package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.List;

public class AverageCalculator {
    public static double calculateAverage(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum/numbers.size();
    }
}
