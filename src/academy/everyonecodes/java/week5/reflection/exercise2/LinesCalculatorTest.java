package academy.everyonecodes.java.week5.reflection.exercise2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public class LinesCalculatorTest {
    LinesCalculator linesCalculator = new LinesCalculator();

    @Test
    void calculatePositives() {
        List<String> input = List.of("1;2;3;4", "1;2;3;4");
        List<String> result = linesCalculator.calculate(input);
        List<String> expected = List.of("10", "10");
        Assertions.assertEquals(expected, result);
    }


}
