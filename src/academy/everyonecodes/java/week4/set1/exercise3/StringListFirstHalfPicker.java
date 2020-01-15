package academy.everyonecodes.java.week4.set1.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringListFirstHalfPicker {
    public String pick(List<String> strings) {
        if (strings.size() == 1) {
            return strings.get(0);
        }
        Random random = new Random();
        int size = strings.size();
        int max = size / 2;
        int randomIndex = random.nextInt(max);
        return strings.get(randomIndex);
    }
}

