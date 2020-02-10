package academy.everyonecodes.java.week7.reflection.exercise1;

import java.util.List;

public class GenderRatioCalculator {
    public String calculate() {
        StudentPerformanceReader reader = new StudentPerformanceReader();
        List<StudentPerformance> performances = reader.read();
        long female = performances.stream()
                .map(StudentPerformance::getGender)
                .filter(gender -> gender.contains("female"))
                .count();
        long male = performances.size() - female;
        return "Gender ratio : " + female + ":" + male;
    }
}
