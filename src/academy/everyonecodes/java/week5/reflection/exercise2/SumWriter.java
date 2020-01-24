package academy.everyonecodes.java.week5.reflection.exercise2;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import academy.everyonecodes.java.week5.set2.exercise2.FileWriter;

import java.util.ArrayList;
import java.util.List;

public class SumWriter {
    FileReader fileReader = new FileReader();
    FileWriter fileWriter = new FileWriter();
    LinesCalculator linesCalculator = new LinesCalculator();

    public void write() {
        String input = "src/academy/everyonecodes/java/week5/reflection/Files/input.csv";
        List<String> inputLines = fileReader.read(input);
        List<String> linesCalculated = linesCalculator.calculate(inputLines);
        fileWriter.write("src/academy/everyonecodes/java/week5/reflection/Files/output.csv", linesCalculated);
    }
}
