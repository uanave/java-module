package academy.everyonecodes.java.week4.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BeforeDashExtractorTest {
    BeforeDashExtractor beforeDashExtractor = new BeforeDashExtractor();

    @Test
    void extract() {
        String input = "my-string";
        String result = beforeDashExtractor.extract(input);
        String expected = "my";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void extractEmpty() {
        String input = "";
        String result = beforeDashExtractor.extract(input);
        String expected = "";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void extractWithNumbers() {
        String input = "Adgr45-AA0";
        String result = beforeDashExtractor.extract(input);
        String expected = "Adgr45";

        Assertions.assertEquals(expected, result);
    }
}
