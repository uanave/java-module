package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

class HappinessDataParserTest {

    private static Stream<Arguments> provideArguments() {
        HappinessRecord record1 = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        HappinessRecord record2 = new HappinessRecord("Ireland", 15, 6.97700023651123);

        return Stream.of(
                Arguments.of(Optional.of(record1), "Lesotho;139;3.80800008773804;4.04434397548437;3.5716561999917;0.521021246910095;1.19009518623352;0;0.390661299228668;0.157497271895409;0.119094640016556;1.42983531951904"),
                Arguments.of(Optional.of(record2), "Ireland;15;6.97700023651123;7.04335166752338;6.91064880549908;1.53570663928986;1.55823111534119;0.80978262424469;0.573110342025757;0.42785832285881;0.29838815331459;1.77386903762817"),
                Arguments.of(Optional.empty(), "3232;aaaa;ssqsq;7.04335166752338;6.91064880549908;1.53570663928986;1.55823111534119;0.80978262424469;0.573110342025757;0.42785832285881;0.29838815331459;1.77386903762817")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void test(Optional<HappinessRecord> expected, String input) {
        HappinessDataParser happinessDataParser = new HappinessDataParser();
        Optional<HappinessRecord> result = happinessDataParser.parseLine(input);
        Assertions.assertEquals(expected, result);
    }
}
