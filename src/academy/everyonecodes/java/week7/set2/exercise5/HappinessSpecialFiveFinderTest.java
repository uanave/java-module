package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HappinessSpecialFiveFinderTest {
    private HappinessSpecialFiveFinder happinessSpecialFiveFinder = new HappinessSpecialFiveFinder();

    @Test
    void test() {
        List<String> result = happinessSpecialFiveFinder.findSpecialFive();
        List<String> expected = List.of("country: Burkina Faso, rank: 134, score: 4.03200006484985",
                "country: Afghanistan, rank: 141, score: 3.79399991035461",
                "country: Madagascar, rank: 144, score: 3.64400005340576",
                "country: South Sudan, rank: 147, score: 3.59100008010864",
                "country: Central African Republic, rank: 155, score: 2.69300007820129");
        assertEquals(expected, result);
    }
}