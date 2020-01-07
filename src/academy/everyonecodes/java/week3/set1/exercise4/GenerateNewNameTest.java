package academy.everyonecodes.java.week3.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenerateNewNameTest {
    GenerateNewName generateNewName = new GenerateNewName();

    @Test
    void generateName() {
        String input = "DSC0004.jpg";

        String result = generateNewName.generateName(input);

        String expected = "DSC0004.png";
        Assertions.assertEquals(expected, result);
    }
}