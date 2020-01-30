package academy.everyonecodes.java.week6.set2.exercise1;

import java.util.List;

public class SpecialNumbersCounter {

    private List<String> numbers = List.of("3", "6", "9");

    public int count(int number) {
        int count = 0;
        String numberToString = String.valueOf(number);
        List<String> inputToList = List.of(numberToString.split(""));
        for (String nr : inputToList) {
            if (numbers.contains(nr)) {
                count++;
            }
        }
        return count;
    }
}
