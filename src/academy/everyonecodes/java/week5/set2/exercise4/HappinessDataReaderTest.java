package academy.everyonecodes.java.week5.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class HappinessDataReaderTest {
    HappinessDataReader happinessDataReader = new HappinessDataReader();
    String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/world-happiness-2017.csv";

    @Test
    void readFirst() {
        List<Optional<HappinessRecord>> result = happinessDataReader.read(contentRootPath);

        HappinessRecord expected = new HappinessRecord("Angola", 140, 3.79500007629395);

        HappinessRecord resultRecord = result.get(1).get();

        Assertions.assertEquals(expected.getCountry(), resultRecord.getCountry());
        Assertions.assertEquals(expected.getRank(), resultRecord.getRank());
        Assertions.assertEquals(expected.getScore(), resultRecord.getScore());
    }

    @Test
    void readLast() {
        List<Optional<HappinessRecord>> result = happinessDataReader.read(contentRootPath);

        HappinessRecord expected = new HappinessRecord("Ireland", 15, 6.97700023651123);

        HappinessRecord resultRecord = result.get(154).get();

        Assertions.assertEquals(expected.getCountry(), resultRecord.getCountry());
        Assertions.assertEquals(expected.getRank(), resultRecord.getRank());
        Assertions.assertEquals(expected.getScore(), resultRecord.getScore());
    }
    @Test
    void checkSize() {
        List<Optional<HappinessRecord>> oResult = happinessDataReader.read(contentRootPath);

        int expected = 155;

        Assertions.assertEquals(expected, oResult.size());
    }
}
