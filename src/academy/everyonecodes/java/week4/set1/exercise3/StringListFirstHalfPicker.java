package academy.everyonecodes.java.week4.set1.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringListFirstHalfPicker {
    public String pick(List<String> randomWords) {
        List<String> randomWordsFirstHalf = new ArrayList<>();
        int size = randomWords.size();
        double start = Math.floor((double) size/2);
        for (int i = (int) start; i < size; i++) {
            randomWordsFirstHalf.add(randomWords.get(i));
        }
        Random random = new Random();
        int index = random.nextInt(randomWordsFirstHalf.size());
        return randomWordsFirstHalf.get(index);
    }
}
