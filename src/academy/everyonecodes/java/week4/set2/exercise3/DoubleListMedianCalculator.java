package academy.everyonecodes.java.week4.set2.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleListMedianCalculator {
    public static double calculate(List<Double> doubles) {
        if (doubles.size() > 0) {
            List<Double> doublesCopy = new ArrayList<>(doubles);
            Collections.sort(doublesCopy);
            int size = doublesCopy.size();
            if (size % 2 != 0) {
                return doublesCopy.get(size / 2);
            } else {
                double median1 = doublesCopy.get(size / 2);
                double median2 = doublesCopy.get(size / 2 - 1);
                return (median1 + median2) / 2;
            }
        }
        return 0.0;
    }
}
