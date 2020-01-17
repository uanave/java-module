package academy.everyonecodes.java.week4.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FromZeroRounderTest {
    FromZeroRounder fromZeroRounder = new FromZeroRounder();

    @Test
    void roundNegative() {
        double input = - 5.3;

        double result = fromZeroRounder.round(input);

        double expected = - 5;

        Assertions.assertEquals(expected, input);
    }
    @Test
    void roundPositive() {
        double input = 5.3;

        double result = fromZeroRounder.round(input);

        double expected = 6;

        Assertions.assertEquals(expected, input);
    }
}
