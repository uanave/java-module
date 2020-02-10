package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenderRatioCalculatorTest {
    private GenderRatioCalculator genderRatioCalculator = new GenderRatioCalculator();

    @Test
    void test() {
        int femaleExpected = 518;
        int maleExpected = 482;
        String expected = "Gender ratio : " + femaleExpected + ":" + maleExpected;
        String result = genderRatioCalculator.calculate();
        System.out.println(result);
        assertEquals(expected, result);
    }

}