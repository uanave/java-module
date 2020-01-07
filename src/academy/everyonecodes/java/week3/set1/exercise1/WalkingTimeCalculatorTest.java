package academy.everyonecodes.java.week3.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WalkingTimeCalculatorTest {
    WalkingTimeCalculator walkingTimeCalculator = new WalkingTimeCalculator();

    @Test
    void calculateWalkingTime() {
        double input  = 1.2;

        double result = walkingTimeCalculator.calculateWalkingTime(input);

        double expected = 18.0;
        Assertions.assertEquals(expected, result);
    }
}