package academy.everyonecodes.java.christmas.Exercise7;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ReverseNumbers reverseNumbers = new ReverseNumbers();
        int[] randomNumbers = {1, 2, 3, 4};
        int[] randomNumbersReversed = reverseNumbers.reverse(randomNumbers);
        System.out.println(Arrays.toString(randomNumbersReversed));
    }
}
