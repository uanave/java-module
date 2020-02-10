package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentPerformanceReaderTest {
    private StudentPerformanceReader studentPerformanceReader = new StudentPerformanceReader();

    @Test
    void test() {
        List<StudentPerformance> resultList = studentPerformanceReader.read();

        StudentPerformance result = resultList.get(1);

        StudentPerformance expected = new StudentPerformance("female", "some college", 69, 90, 88);
        assertEquals(expected, result);
    }

}