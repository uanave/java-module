package academy.everyonecodes.java.week7.reflection.exercise1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentPerformanceReader {
    private StreamFileReader streamFileReader = new StreamFileReader();
    private StudentPerformanceParser parser = new StudentPerformanceParser();

    public List<StudentPerformance> read() {
        String input = "src/academy/everyonecodes/java/week7/reflection/Files/students-performance.csv";
        return streamFileReader.readLines(input)
                .skip(1)
                .map(line -> parser.parseLine(line))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

}
