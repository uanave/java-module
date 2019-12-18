package academy.everyonecodes.java.week2.set2.exercise4;

public class DistanceCalculator {
    public double calculateDistanceInKilometers(double numberOfSteps) {
        double stepToKm = 0.000762;
        return numberOfSteps * stepToKm;
    }
}
