package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class HappinessDataReaderTest {
    private HappinessDataReader happinessDataReader = new HappinessDataReader();


    @Test
    void readFirst() {
        List<Optional<HappinessRecord>> oResult = happinessDataReader.read();

        Optional<HappinessRecord> result = oResult.get(0);

        HappinessRecord expected = new HappinessRecord("Lesotho", 139, 3.80800008773804);

        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(expected, result.get());
    }

    @Test
    void readLast() {
        List<Optional<HappinessRecord>> oResult = happinessDataReader.read();

        Optional<HappinessRecord> result = oResult.get(153);

        HappinessRecord expected = new HappinessRecord("United States", 14, 6.99300003051758);

        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(expected, result.get());
    }
}