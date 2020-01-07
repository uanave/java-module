package academy.everyonecodes.java.week3.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TripTimeCalculatorTest {
    TripTimeCalculator tripTimeCalculator = new TripTimeCalculator();

    @Test
    void calculateTime() {
        int stations = 4;
        double walkingDistanceToTram = 1.2;
        double walkingDistanceToFriendHouse = 0.8;

        double result = tripTimeCalculator.calculateTime(stations, walkingDistanceToTram, walkingDistanceToFriendHouse);

        double expected = 46;

        Assertions.assertEquals(expected, result);
    }
}