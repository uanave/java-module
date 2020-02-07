package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Top5ParentalEducationFinderTest {

    private Top5ParentalEducationFinder finder = new Top5ParentalEducationFinder();

    @Test
    void test() {
        List<String> expected = List.of("associate's degree", "some college", "bachelor's degree", "some college", "some college");

        List<String> result = finder.find();

        assertEquals(expected, result);
    }

}