package academy.everyonecodes.java.christmas.Exercise7;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ReverseNumbers reverseNumbers = new ReverseNumbers();
        List<Integer> randomNumbers = List.of(1, 2, 3, 4);
        List<Integer> randomNumbersReversed = reverseNumbers.reverse(randomNumbers);
        System.out.println(randomNumbersReversed);
    }
}
