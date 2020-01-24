package academy.everyonecodes.java.week5.reflection.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class LinesCalculatorTest {
    LinesCalculator linesCalculator = new LinesCalculator();

    @Test
    void calculatePositives() {
        List<String> input = List.of("1;2;3;4", "1;2;3;4");
        List<Optional<Integer>> oResult = linesCalculator.calculate(input);
        List<Integer> expected = List.of(10, 10);
        Assertions.assertEquals(expected, oResult.get());
    }
}
