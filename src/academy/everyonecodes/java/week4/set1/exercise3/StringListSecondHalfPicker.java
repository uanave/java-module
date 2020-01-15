package academy.everyonecodes.java.week4.set1.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringListSecondHalfPicker {
    public String pick(List<String> strings) {
        Random random = new Random();
        int size = strings.size();
        int half = size / 2;
        int relativeMax = size - half;
        int randomIndex = random.nextInt(relativeMax) + half;
        return strings.get(randomIndex);

    }
}
