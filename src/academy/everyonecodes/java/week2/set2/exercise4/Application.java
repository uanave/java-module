package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> steps = StepCollector.collect();
        double average = AverageCalculator.calculateAverage(steps);
        double distance = DistanceCalculator.calculateDistanceInKilometers(average);
        System.out.println("The average in kilometers is " + distance);
    }
}
