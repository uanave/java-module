package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class GotDataParserTest {
    GotDataParser gotDataParser = new GotDataParser();


    @Test
    void parseLineThree() {
        String input = "Aegon Frey (Jinglebell);None;299;3;51;49;1;1;0;0;1;0;0";

        Optional<Character> result = gotDataParser.parseLine(input);

        Character expected = new Character("Aegon Frey (Jinglebell)", 3, "male");
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(expected.getName(), result.get().getName());
        Assertions.assertEquals(expected.getBookOfDeath(), result.get().getBookOfDeath());
        Assertions.assertEquals(expected.getGender(), result.get().getGender());
    }
    @Test
    void parseLastLine() {
        String input = "Talbert Serry;Tyrell;300;4;29;29;1;1;0;0;0;1;0";

        Optional<Character> result = gotDataParser.parseLine(input);

        Character expected = new Character("Talbert Serry", 4, "male");
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(expected.getName(), result.get().getName());
        Assertions.assertEquals(expected.getBookOfDeath(), result.get().getBookOfDeath());
        Assertions.assertEquals(expected.getGender(), result.get().getGender());
    }

    @Test
    void parseWrongLine() {
        String input = "Talbert Serry;Tyrell;300;4aa;29;29;1;1;0;0;0;1;0";

        Optional<Character> result = gotDataParser.parseLine(input);

        Character expected = new Character("Talbert Serry", 4, "male");
        Assertions.assertTrue(result.isEmpty());
    }
}
