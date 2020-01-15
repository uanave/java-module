package academy.everyonecodes.java.week4.set2.exercise4;

import academy.everyonecodes.java.week4.set2.exercise3.DoubleListMedianCalculator;

import java.util.ArrayList;
import java.util.List;

public class DoubleListFromMedianSubtractor {
    public List<Double> calculate(List<Double> input) {
        List<Double> inputCopy = new ArrayList<>(input);
        double median = DoubleListMedianCalculator.calculate(input);
        List<Double> inputSubtracted = new ArrayList<>();
        for (Double number : inputCopy) {
            inputSubtracted.add(number - median);
        }
        return inputSubtracted;
    }
}
