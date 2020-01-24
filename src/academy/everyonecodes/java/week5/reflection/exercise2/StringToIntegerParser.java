package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;

public class StringToIntegerParser {
    public List<Integer> parse(String input) {
        List<Integer> inputAsInteger = new ArrayList<>();
        List<String> inputToList = List.of(input.split(";"));
        for (String number : inputToList) {
            try {
                inputAsInteger.add(Integer.valueOf(number));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return inputAsInteger;
    }
}

