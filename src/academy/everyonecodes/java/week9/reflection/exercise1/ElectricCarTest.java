package academy.everyonecodes.java.week9.reflection.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ElectricCarTest {
    ElectricCar electricCar = new ElectricCar("Hyundai");

    @Test
    void describe() {
        String result = electricCar.describe();

        String expected = "I am Hyundai car!";
        assertEquals(expected, result);
    }
}