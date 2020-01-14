package academy.everyonecodes.java.week4.set2.exercise2;

import java.util.List;

public class LineSumCalculator {
    public int calculate(String input) {
        int sum = 0;
        StringAsIntegerListParser stringAsIntegerListParser = new StringAsIntegerListParser();
        List<Integer> parsedInput = stringAsIntegerListParser.parse(input);
        for (int number : parsedInput) {
            sum += number;
        }
        return sum;
    }
}
