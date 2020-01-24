package academy.everyonecodes.java.week5.set2.exercise7;

import java.util.ArrayList;
import java.util.List;

public class IntegerListToStringConverter {
    public List<String> convert(List<Integer> input) {
        List<String> inputAsString = new ArrayList<>();
        for (Integer number : input) {
            inputAsString.add(String.valueOf(number));
        }
        return inputAsString;
    }
}
