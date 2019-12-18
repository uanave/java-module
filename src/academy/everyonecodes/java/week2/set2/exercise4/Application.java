package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        StepCollector stepCollector = new StepCollector();
        List<Integer> steps = stepCollector.collect();
        AverageCalculator averageCalculator = new AverageCalculator();
        double average = averageCalculator.calculateAverage(steps);
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        double distance = distanceCalculator.calculateDistanceInKilometers(average);
        System.out.println("The average in kilometers is " + distance);
    }
}
