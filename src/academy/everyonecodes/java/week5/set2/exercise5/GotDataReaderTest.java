package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GotDataReaderTest {
    GotDataReader gotDataReader = new GotDataReader();
    String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/got-characters.csv";


    @Test
    void readFirst() {
        Character expected = new Character("Adrack Humble", 5, "male");

        List<Character> oResult = gotDataReader.read(contentRootPath);

        Character result = oResult.get(3);
        Assertions.assertEquals(expected.getName(), result.getName());
        Assertions.assertEquals(expected.getBookOfDeath(), result.getBookOfDeath());
        Assertions.assertEquals(expected.getGender(), result.getGender());
    }

    @Test
    void readLast() {
        Character expected = new Character("Talbert Serry", 4, "male");

        List<Character> oResult = gotDataReader.read(contentRootPath);

        Character result = oResult.get(916);
        Assertions.assertEquals(expected.getName(), result.getName());
        Assertions.assertEquals(expected.getBookOfDeath(), result.getBookOfDeath());
        Assertions.assertEquals(expected.getGender(), result.getGender());
    }
}
