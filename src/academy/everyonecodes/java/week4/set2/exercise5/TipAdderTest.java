package academy.everyonecodes.java.week4.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TipAdderTest {
    TipAdder tipAdder = new TipAdder();

    @ParameterizedTest
    @CsvSource({
            "24.50, 23.14",
            "3, 2.45",
            "74.5, 70.5"
    })
    void add(double expected, double input) {
        double result = tipAdder.add(input);

        Assertions.assertEquals(expected, result);
    }
}
