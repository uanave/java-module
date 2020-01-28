package academy.everyonecodes.java.week6.set2.exercise1;

import java.util.List;

public class SpecialNumbersCounter {
    public int count(int number) {
        int count = 0;
        if (number > 0) {
            String numberToString = String.valueOf(number);
            List<String> inputToList = List.of(numberToString.split(""));
            List<String> numbers = List.of("3", "6", "9");
            for (String nr : inputToList) {
                if (numbers.contains(nr)) {
                    count++;
                }
            }
        }
        return count;
    }
}
