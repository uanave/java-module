package academy.everyonecodes.java.week4.set1.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringListSecondHalfPicker {
    public String pick(List<String> randomWords) {
        List<String> secondHalfOfRandomWords = new ArrayList<>();
        int size = randomWords.size();
        for (int i = size/2; i < size; i++) {
                secondHalfOfRandomWords.add(randomWords.get(i));
        }
        Random random = new Random();
        int randomIndex = random.nextInt(secondHalfOfRandomWords.size());
        return secondHalfOfRandomWords.get(randomIndex);
    }
}
