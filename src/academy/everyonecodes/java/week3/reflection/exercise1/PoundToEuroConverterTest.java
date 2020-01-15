package academy.everyonecodes.java.week3.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PoundToEuroConverterTest {
    PoundToEuroConverter poundsToEurosConverter = new PoundToEuroConverter();

    @ParameterizedTest
    @CsvSource({
            "11.764705882352942, 10.0",
            "117.64705882352942, 100.0",
            "20.58823529411765, 17.5"
    })
    void converter(double expected, double input) {

        double result = poundsToEurosConverter.convert(input);
        Assertions.assertEquals(expected, result);

    }
}


