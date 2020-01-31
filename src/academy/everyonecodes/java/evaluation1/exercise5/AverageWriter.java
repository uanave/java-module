package academy.everyonecodes.java.evaluation1.exercise5;

import academy.everyonecodes.java.evaluation1.exercise4.FileReader;
import academy.everyonecodes.java.evaluation1.exercise4.FileWriter;

import java.util.ArrayList;
import java.util.List;

public class AverageWriter {

    private StringToIntegerParser stringToIntegerParser = new StringToIntegerParser();
    private IntegerListAverageCalculator integerListAverageCalculator = new IntegerListAverageCalculator();
    private FileReader fileReader = new FileReader();
    private FileWriter fileWriter = new FileWriter();

    public void write(String inputPath, String outputPath) {
        List<String> inputAsList = fileReader.read(inputPath);

        List<Double> averages = new ArrayList<>();

        for (String input : inputAsList) {
            List<Integer> inputAsNumbers = stringToIntegerParser.parse(input);
            double lineAverage = integerListAverageCalculator.calculate(inputAsNumbers);
            averages.add(lineAverage);
        }
        System.out.println(averages);

        List<String> averagesAsString = new ArrayList<>();
        for (Double average : averages) {
            averagesAsString.add(String.valueOf(average));
        }
        System.out.println(averagesAsString);
        fileWriter.write(outputPath, averagesAsString);

    }
}
