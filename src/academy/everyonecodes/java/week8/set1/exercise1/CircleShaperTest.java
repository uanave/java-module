package academy.everyonecodes.java.week8.set1.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleShaperTest {
    Shaper shaper = new CircleShaper();

    @Test
    void test() {
        CircleShaper circleShaper = new CircleShaper();
        Shaper xxx = new CircleShaper();
        String shape3 = circleShaper.getShape();

        Shaper shaper = circleShaper;
        String shape1 = shaper.getShape();

        CircleShaper otherShaper = new CircleShaper();
        String shape2 = otherShaper.getShape();

        String expected = "Circle";

        assertEquals(expected, shape1);
        assertEquals(expected, shape2);
        assertEquals(expected, shape3);
    }
}
