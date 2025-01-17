package academy.everyonecodes.java.week5.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class HappinessDataParserTest {
    HappinessDataParser happinessDataParser = new HappinessDataParser();

    @Test
    void parseFirstLine() {
        String input = "Serbia;73;5.39499998092651;5.49156965613365;5.29843030571938;1.06931757926941;1.25818979740143;0.65078467130661;0.208715528249741;0.220125883817673;0.040903780609369;1.94708442687988";

        HappinessRecord expected = new HappinessRecord("Serbia", 73, 5.39499998092651);

        Optional<HappinessRecord> oResult = happinessDataParser.parseLine(input);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected.getCountry(), oResult.get().getCountry());
        Assertions.assertEquals(expected.getRank(), oResult.get().getRank());
        Assertions.assertEquals(expected.getScore(), oResult.get().getScore());
    }

    @Test
    void parseLastLine() {
        String input = "Togo;150;3.39499998092651;1.25818979740143;0.65078467130661;0.208715528249741;0.220125883817673;0.040903780609369;1.94708442687988";

        HappinessRecord expected = new HappinessRecord("Togo", 150, 3.39499998092651);

        Optional<HappinessRecord> oResult = happinessDataParser.parseLine(input);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected.getCountry(), oResult.get().getCountry());
        Assertions.assertEquals(expected.getRank(), oResult.get().getRank());
        Assertions.assertEquals(expected.getScore(), oResult.get().getScore());
    }

    @Test
    void parseNonValidLine() {
        String input = "Serbia;73place;;5.49156965613365;5.29843030571938;1.06931757926941;1.25818979740143;0.65078467130661;0.208715528249741;0.220125883817673;0.040903780609369;1.94708442687988";

        Optional<HappinessRecord> oResult = happinessDataParser.parseLine(input);

        Assertions.assertTrue(oResult.isEmpty());
    }
}
