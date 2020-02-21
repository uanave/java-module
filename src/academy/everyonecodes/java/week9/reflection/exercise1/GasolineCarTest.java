package academy.everyonecodes.java.week9.reflection.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GasolineCarTest {
    GasolineCar gasolineCar = new GasolineCar("Dacia");

    @Test
    void describe() {
        String result = gasolineCar.describe();

        String expected = "I am a Dacia car!";
        assertEquals(expected, result);
    }
}