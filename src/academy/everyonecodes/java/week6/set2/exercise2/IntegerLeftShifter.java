package academy.everyonecodes.java.week6.set2.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerLeftShifter {
    public List<Integer> shiftOne(List<Integer> input) {
        List<Integer> inputCopy = new ArrayList<>(input);
        Collections.rotate(inputCopy, -1);
        return inputCopy;
    }
}
