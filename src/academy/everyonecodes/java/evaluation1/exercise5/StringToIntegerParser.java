package academy.everyonecodes.java.evaluation1.exercise5;

import java.util.ArrayList;
import java.util.List;

public class StringToIntegerParser {
    public List<Integer> parse(String input) {
        List<Integer> inputAsInteger = new ArrayList<>();
        List<String> inputToList = List.of(input.split(" "));
        for (String number : inputToList) {
            try {
                inputAsInteger.add(Integer.valueOf(number));
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        return inputAsInteger;
    }
}

