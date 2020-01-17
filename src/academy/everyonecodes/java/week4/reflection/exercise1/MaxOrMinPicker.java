package academy.everyonecodes.java.week4.reflection.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MaxOrMinPicker {
    public int pick(List<Integer> numbers) {
        if (numbers.size() == 0) {
            return (int) Math.random();
        } else {
            List<Integer> numbersSortedCopy = new ArrayList<>(numbers);
            Collections.sort(numbersSortedCopy);
            List<Integer> maxAndMin = new ArrayList<>();
            maxAndMin.add(numbersSortedCopy.get(0));
            maxAndMin.add(numbersSortedCopy.get(numbersSortedCopy.size()-1));
            Random random = new Random();
            int rand = random.nextInt(numbersSortedCopy.size());
            return numbersSortedCopy.get(rand);
        }
    }
}
