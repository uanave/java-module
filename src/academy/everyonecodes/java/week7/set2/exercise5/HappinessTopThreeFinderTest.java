package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HappinessTopThreeFinderTest {

    private HappinessTopThreeFinder happinessTopThreeFinder = new HappinessTopThreeFinder();

    @Test
    void testTopThree() {
        List<String> result = happinessTopThreeFinder.findTopThree();

        List<String> expected = List.of("country: Norway, rank: 1, score: 7.53700017929077", "country: Denmark, rank: 2, score: 7.52199983596802", "country: Iceland, rank: 3, score: 7.50400018692017");

        assertEquals(expected, result);
    }

}