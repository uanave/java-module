package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LinesCalculator {
    private StringToIntegerParser stringToIntegerParser = new StringToIntegerParser();
    private IntegerListSumCalculator integerListSumCalculator = new IntegerListSumCalculator();
    public List<Optional<Integer>> calculate (List<String> input) {
        List<Optional<Integer>> sums = new ArrayList<>();
        List<Integer> parsedValues = new ArrayList<>();
        for (String value : input) {
            List<Integer> parsed = stringToIntegerParser.parse(value);
            Optional<Integer> sum = integerListSumCalculator.sum(parsed);
            sums.add(sum);
        }
        return sums;
    }
}
