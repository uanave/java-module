package academy.everyonecodes.java.week8.set1.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleShaperTest {
    Shaper shaper = new CircleShaper();

    @Test
    void test() {
        CircleShaper circleShaper = new CircleShaper();
        String shape3 = circleShaper.getShape();

        Shaper shaper = new CircleShaper();
        String shape1 = shaper.getShape();

        CircleShaper anotherShaper = new CircleShaper();
        String shape2 = anotherShaper.getShape();

        String expected = "Circle";

        assertEquals(expected, shape1);
        assertEquals(expected, shape2);
        assertEquals(expected, shape3);
    }
}
