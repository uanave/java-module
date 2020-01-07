package academy.everyonecodes.java.week3.set1.exercise1;

public class TripTimeCalculator {
    public double calculateTime(int numberOfStations, double walkingDistanceToTram, double walkingDistanceToFriendHouse) {
        TramTimeCalculator tramTimeCalculator = new TramTimeCalculator();
        int tramTime = tramTimeCalculator.calculateTramTime(numberOfStations);
        WalkingTimeCalculator walkingTimeCalculator = new WalkingTimeCalculator();
        double walkedDistanceToTram = walkingTimeCalculator.calculateWalkingTime(walkingDistanceToTram);
        double walkedDistanceToFriend = walkingTimeCalculator.calculateWalkingTime(walkingDistanceToFriendHouse);
        return tramTime + walkedDistanceToTram + walkedDistanceToFriend;
    }
}
