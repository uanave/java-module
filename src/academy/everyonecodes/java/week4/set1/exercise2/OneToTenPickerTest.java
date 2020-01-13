package academy.everyonecodes.java.week4.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class OneToTenPickerTest {
    OneToTenPicker oneToTenPicker = new OneToTenPicker();

    @Test
    void pick() {
        int result = oneToTenPicker.pick();
        Assertions.assertTrue(result > 0 && result < 11);
    }
}
