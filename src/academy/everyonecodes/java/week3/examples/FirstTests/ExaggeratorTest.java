package academy.everyonecodes.java.week3.examples.FirstTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExaggeratorTest {
    Exaggerator exaggerator = new Exaggerator();

    @Test
    void exaggerate() {
        String input = "ice-cream";

        String result = exaggerator.exaggerate(input);

        String expected = "ice-cream!";
        Assertions.assertEquals(expected, result);
    }

}