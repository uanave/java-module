package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentPerformanceParserTest {
    private StudentPerformanceParser studentPerformanceParser = new StudentPerformanceParser();

    @Test
    void test() {
        String input = "female;bachelor's degree;67;69;75";

        StudentPerformance expected = new StudentPerformance("female", "bachelor's degree", 67, 69, 75);

        Optional<StudentPerformance> result = studentPerformanceParser.parseLine(input);

        assertTrue(result.isPresent());
        assertEquals(expected, result.get());
    }

}