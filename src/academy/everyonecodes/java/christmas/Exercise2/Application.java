package academy.everyonecodes.java.christmas.Exercise2;

public class Application {
    public static void main(String[] args) {
        double distanceToTram = 2.5;
        int tramStations = 5;
        double distanceToFriendHouse = 1.2;
        TripTimeCalculator tripTimeCalculator = new TripTimeCalculator();
        double timeSpentTravelling = tripTimeCalculator.calculateTime(tramStations, distanceToTram, distanceToFriendHouse);
        System.out.println("Your time spent on the road when visiting your friend is " + timeSpentTravelling + " minutes.");
    }
}
