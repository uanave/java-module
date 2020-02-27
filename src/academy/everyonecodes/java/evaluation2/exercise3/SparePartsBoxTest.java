package academy.everyonecodes.java.evaluation2.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SparePartsBoxTest {
    SparePartsBox sparePartsBox = new SparePartsBox(10);

    @Test
    void testSparePartsBox() {
        Spaceship input = new Spaceship(60, 40);

        sparePartsBox.apply(input);

        int result = input.getHealth();

        int expected = 70;
        assertEquals(expected, result);
    }
}