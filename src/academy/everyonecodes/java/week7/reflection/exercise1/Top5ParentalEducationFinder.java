package academy.everyonecodes.java.week7.reflection.exercise1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Top5ParentalEducationFinder {

    private StudentPerformanceReader reader = new StudentPerformanceReader();

    public List<String> find() {
        List<StudentPerformance> performances = reader.read();
        return performances.stream()
                .sorted(Comparator.comparing(StudentPerformance::getMathScore).reversed())
                .limit(5)
                .map(StudentPerformance::getParentalEducation)
                .collect(Collectors.toList());
    }
}
