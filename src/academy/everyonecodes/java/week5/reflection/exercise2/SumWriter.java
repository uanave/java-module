package academy.everyonecodes.java.week5.reflection.exercise2;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import academy.everyonecodes.java.week5.set2.exercise2.FileWriter;

import java.nio.file.Path;
import java.util.List;

public class SumWriter {
    FileReader fileReader = new FileReader();
    FileWriter fileWriter = new FileWriter();
    IntegerListSumCalculator integerListSumCalculator = new IntegerListSumCalculator();

    public void write(String contentRootPath) {
        List<String> elements = fileReader.read(contentRootPath);
        List

    }
}
