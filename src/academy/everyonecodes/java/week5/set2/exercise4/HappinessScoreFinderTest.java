package academy.everyonecodes.java.week5.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class HappinessScoreFinderTest {
    HappinessScoreFinder happinessScoreFinder = new HappinessScoreFinder();

    @Test
    void findForAfghanistan() {
        List<HappinessRecord> worldHappiness = List.of(new HappinessRecord("Lesotho", 139, 3.80800008773804),
                new HappinessRecord("Angola", 140, 3.79500007629395),
                new HappinessRecord("Afghanistan", 141, 3.79399991035461));
        String country = "Afghanistan";

        double expected = 3.79399991035461;

        Optional<Double> oResult = happinessScoreFinder.findFor(worldHappiness, country);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void findForAngola() {
        List<HappinessRecord> worldHappiness = List.of(new HappinessRecord("Lesotho", 139, 3.80800008773804),
                new HappinessRecord("Angola", 140, 3.79500007629395),
                new HappinessRecord("Afghanistan", 141, 3.79399991035461));
        String country = "Angola";

        double expected = 3.79500007629395;

        Optional<Double> oResult = happinessScoreFinder.findFor(worldHappiness, country);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void findForDoesNotExist() {
        List<HappinessRecord> worldHappiness = List.of(new HappinessRecord("Lesotho", 139, 3.80800008773804),
                new HappinessRecord("Angola", 140, 3.79500007629395),
                new HappinessRecord("Afghanistan", 141, 3.79399991035461));
        String inputCountry = "Botswana";

        Optional<Double> oResult = happinessScoreFinder.findFor(worldHappiness, inputCountry);

        Assertions.assertTrue(oResult.isEmpty());
    }
}
