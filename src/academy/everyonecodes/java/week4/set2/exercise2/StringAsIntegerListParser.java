package academy.everyonecodes.java.week4.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class StringAsIntegerListParser {
    public List<Integer> parse(String input) {
        String[] inputAsList = input.split(";");
        List<Integer> parsedInput = new ArrayList<>();
        for (String item : inputAsList) {
            parsedInput.add(Integer.valueOf(item));
        }
        return parsedInput;
    }

}
