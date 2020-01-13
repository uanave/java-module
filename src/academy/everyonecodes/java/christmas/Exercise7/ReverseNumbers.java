package academy.everyonecodes.java.christmas.Exercise7;

import java.util.ArrayList;
import java.util.List;

public class ReverseNumbers {
    public List<Integer> reverse(List<Integer> randomNumbers) {
        List<Integer> reversedNumbers = new ArrayList<>();
        for (int i = randomNumbers.size()-1; i >= 0; i--) {
            int number = randomNumbers.get(i);
            reversedNumbers.add(number);
        }
        return reversedNumbers;

    }
}
