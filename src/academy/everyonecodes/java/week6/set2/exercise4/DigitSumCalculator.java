package academy.everyonecodes.java.week6.set2.exercise4;

import java.util.ArrayList;
import java.util.List;

public class DigitSumCalculator {
    public int calculate(int number) {
        String numberToString = String.valueOf(number);
        List<String> numberToList = List.of(numberToString.split(""));
        List<Integer> digits = new ArrayList<>();
        for (String nr : numberToList) {
            try {
                digits.add(Integer.parseInt(nr));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
}
