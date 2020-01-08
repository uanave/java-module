package academy.everyonecodes.java.week3.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MileToKilometerConverterTest {
    MileToKilometerConverter mileToKilometerConverter = new MileToKilometerConverter();

    @ParameterizedTest
    @CsvSource({
            "1.609, 1",
            "4.0225, 2.5",
            "160.9, 100"
    })
    void convert(double expected, double input) {
        double result = mileToKilometerConverter.convert(input);

        Assertions.assertEquals(expected, result);
    }
}
