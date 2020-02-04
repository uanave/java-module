package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class HappinessDataReaderTest {
    private HappinessDataReader happinessDataReader = new HappinessDataReader();


    @Test
    void readFirst() {
        List<HappinessRecord> result = happinessDataReader.read();

        HappinessRecord expected = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        Assertions.assertEquals(expected, result.get(0));
    }

    @Test
    void readLast() {
        List<HappinessRecord> result = happinessDataReader.read();

        HappinessRecord expected = new HappinessRecord("United States", 14, 6.99300003051758);
        Assertions.assertEquals(expected, result.get(153));
    }

    @Test
    void readSize() {
        List<HappinessRecord> result = happinessDataReader.read();

        int expectedSize = 155;
        Assertions.assertEquals(expectedSize, result.size());
    }
}