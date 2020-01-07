package academy.everyonecodes.java.week3.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TramTimeCalculatorTest {
    TramTimeCalculator tramTimeCalculator = new TramTimeCalculator();

    @Test
    void calculateTramTime() {
        int input = 4;

        int result = tramTimeCalculator.calculateTramTime(input);

        int expected = 16;
        Assertions.assertEquals(expected, result);
    }
}