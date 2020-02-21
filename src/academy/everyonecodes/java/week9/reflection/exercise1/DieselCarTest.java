package academy.everyonecodes.java.week9.reflection.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DieselCarTest {
    DieselCar dieselCar = new DieselCar("Renault");

    @Test
    void describe() {
        String result = dieselCar.describe();

        String expected = "I am a Renault car!";
        assertEquals(expected, result);
    }
}