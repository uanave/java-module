package academy.everyonecodes.java.week7.reflection.exercise1;

import java.util.List;
import java.util.Optional;

public class StudentPerformanceParser {
    public Optional<StudentPerformance> parseLine(String string) {
        List<String> line = List.of(string.split(";"));
        String gender = line.get(0);
        String parentalEducation = line.get(1);
        try {
            int mathScore = Integer.parseInt(line.get(2));
            int readingScore = Integer.parseInt(line.get(3));
            int writingScore = Integer.parseInt(line.get(4));
            return Optional.of(new StudentPerformance(gender, parentalEducation, mathScore, readingScore, writingScore));

        } catch (NumberFormatException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

}
