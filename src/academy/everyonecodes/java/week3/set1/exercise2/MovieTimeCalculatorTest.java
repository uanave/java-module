package academy.everyonecodes.java.week3.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieTimeCalculatorTest {
    MovieTimeCalculator movieTimeCalculator = new MovieTimeCalculator();

    @Test
    void calculateTimeForFirstSeason() {
        int input = 2;

        int result = movieTimeCalculator.calculateTimeForFirstSeason(input);

        int expected = 84;
        Assertions.assertEquals(expected, result);
    }
}