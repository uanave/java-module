package academy.everyonecodes.java.week4.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PngCheckerTest {
    PngChecker pngChecker = new PngChecker();

    @ParameterizedTest
    @CsvSource({
            "true, 'DSC5678.png'",
            "false, 'DSC6789.jpg'",
            "true, 'DSC5677.PNG'",
            "true, 'DSC67584.PnG'",
            "false, 'DSC7674.pNT'"
    })
    void check(boolean expected, String input) {
        boolean result = pngChecker.check(input);

        Assertions.assertEquals(expected, result);
    }

}
