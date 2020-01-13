package academy.everyonecodes.java.week4.set1.exercise3;

import java.util.List;
import java.util.Random;

public class StringListFirstHalfPicker {
    public String pick(List<String> randomWords) {
        Random random = new Random();
        int size = randomWords.size()/2;
        int randomIndex = random.nextInt(size);
        return randomWords.get(randomIndex);
    }
}
