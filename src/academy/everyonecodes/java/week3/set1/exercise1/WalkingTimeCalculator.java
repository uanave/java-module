package academy.everyonecodes.java.week3.set1.exercise1;

public class WalkingTimeCalculator {
    public double calculateWalkingTime(double walkingDistanceKilometers) {
        double minutesPerKm = 15;
        return minutesPerKm * walkingDistanceKilometers;
    }
}
