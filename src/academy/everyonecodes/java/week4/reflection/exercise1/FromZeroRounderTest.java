package academy.everyonecodes.java.week4.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FromZeroRounderTest {
    FromZeroRounder fromZeroRounder = new FromZeroRounder();

    @ParameterizedTest
    @CsvSource({
            "1.0, 0.1",
            "2, 1.33"
    })
    void round(double expected, double input) {
        double result = fromZeroRounder.round(input);

        Assertions.assertEquals(expected, result);
    }
}
