package academy.everyonecodes.java.week8.set1.exercise2;

import academy.everyonecodes.java.week8.set1.exercise1.CircleShaper;
import academy.everyonecodes.java.week8.set1.exercise1.Shaper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareAndTriangleShaperTest {

    @Test
    void test() {
        Shaper circleShaper = new CircleShaper();
        Shaper squareShaper = new SquareShaper();
        Shaper triangleShaper = new TriangleShaper();

        List<String> result = List.of(circleShaper, squareShaper, triangleShaper).stream()
                .map(Shaper::getShape)
                .collect(toList());

        List<String> expected = List.of("Circle", "Square", "Triangle");
        assertEquals(expected, result);
    }
}
