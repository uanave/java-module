package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;


public class LinesCalculator {
    private StringToIntegerParser stringToIntegerParser = new StringToIntegerParser();
    private IntegerListSumCalculator integerListSumCalculator = new IntegerListSumCalculator();

    public List<String> calculate(List<String> input) {
        List<Integer> sums = new ArrayList<>();
        for (String value : input) {
            List<Integer> parsed = stringToIntegerParser.parse(value);
            sums.add(integerListSumCalculator.sum(parsed));
        }
        List<String> sumsAsString = new ArrayList<>();
        for (int sum : sums) {
            sumsAsString.add(String.valueOf(sum));
        }
        return sumsAsString;
    }
}
