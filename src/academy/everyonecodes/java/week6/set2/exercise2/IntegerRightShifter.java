package academy.everyonecodes.java.week6.set2.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerRightShifter {
    public List<Integer> shiftTwo(List<Integer> input) {
        List<Integer> inputCopy = new ArrayList<>(input);
        Collections.rotate(inputCopy, 2);
        return inputCopy;
    }
}
