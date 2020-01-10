package academy.everyonecodes.java.week3.set1.exercise3;

import java.util.ArrayList;
import java.util.List;

public class ReverseNumbers {
    public List<Integer> reverse(List<Integer> numbers) {
        ArrayList<Integer> numbersReversed = new ArrayList<>(numbers.size());
        for (int i = numbers.size() - 1; i >= 0; i--) {
            numbersReversed.add(numbers.get(i));
        }
        return numbersReversed;
    }
}

