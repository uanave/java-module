package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class HappinessDataParserTest {
    HappinessDataParser happinessDataParser = new HappinessDataParser();

    @Test
    void parseFirst() {

        HappinessRecord expected = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        String input = "Lesotho;139;3.80800008773804;4.04434397548437;3.5716561999917;0.521021246910095;1.19009518623352;0;0.390661299228668;0.157497271895409;0.119094640016556;1.42983531951904";
        Optional<HappinessRecord> oResult = happinessDataParser.parseLine(input);
        Assertions.assertTrue(expected.equals(oResult.get()));

    }

    @Test
    void parseLastLine() {
        String input = "Ireland;15;6.97700023651123;7.04335166752338;6.91064880549908;1.53570663928986;1.55823111534119;0.80978262424469;0.573110342025757;0.42785832285881;0.29838815331459;1.77386903762817";

        HappinessRecord expected = new HappinessRecord("Ireland", 15, 6.97700023651123);

        Optional<HappinessRecord> oResult = happinessDataParser.parseLine(input);
        Assertions.assertTrue(expected.equals(oResult.get()));

    }

    @Test
    void parseNonValidLine() {
        String input = "Iceland;3aa;7.50400018692017;7.62203047305346;7.38596990078688;1.480633020401;1.6105740070343;0.833552122116089;0.627162635326385;0.475540220737457;0.153526559472084;2.32271528244019\n";

        Optional<HappinessRecord> oResult = happinessDataParser.parseLine(input);
        Assertions.assertTrue(oResult.isEmpty());
    }
}
