package academy.everyonecodes.java.evaluation2.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeaponsUpgradeBoxTest {
    WeaponsUpgradeBox upgrade = new WeaponsUpgradeBox(10);

    @Test
    void testUpgradeBox() {
        Spaceship input = new Spaceship(50, 50);

        upgrade.apply(input);

        int result = input.getDamage();

        int expected = 60;
        assertEquals(expected, result);
    }

}