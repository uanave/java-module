package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.List;

public class IntegerListSumCalculator {
    public int sum(List<Integer> numbers) {
        int sum = 0;
        if (numbers.size() > 0) {
            for (int number : numbers) {
                sum += number;
            }

        }
        return sum;
    }
}
