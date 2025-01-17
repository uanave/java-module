package academy.everyonecodes.java.week8.set1.exercise3;

import academy.everyonecodes.java.week8.set1.exercise1.Shaper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleShaperTest {
    RectangleShaper rectangleShaper = new RectangleShaper();

    @Test
    void testRectangleShaper() {
        String color = rectangleShaper.getColor();
        String shape = rectangleShaper.getShape();
        String expectedColor = "Green";
        String expectedShape = "Rectangle";
        assertEquals(expectedColor, color);
        assertEquals(expectedShape, shape);
    }

    @Test
    void testColoredShaper() {
        Colored colored = (Colored) rectangleShaper;
        String color = colored.getColor();
        String expectedColor = "Green";
        assertEquals(expectedColor, color);

        Shaper shaper = (Shaper) rectangleShaper;
        String shape = shaper.getShape();
        String expectedShape = "Rectangle";
        assertEquals(expectedShape, shape);

        List<RectangleShaper> rectangleShapers = List.of(rectangleShaper);
        List<Colored> coloreds = List.of(rectangleShaper, colored);
        List<Shaper> shapes = List.of(rectangleShaper, shaper);
    }
}