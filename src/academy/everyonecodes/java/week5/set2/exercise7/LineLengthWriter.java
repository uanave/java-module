package academy.everyonecodes.java.week5.set2.exercise7;

import academy.everyonecodes.java.week5.set2.exercise2.FileWriter;

import java.util.List;

public class LineLengthWriter {
    public void write (String contentRootPathRead, String contentRootPathWrite) {
        LineLengthReader lineLengthReader = new LineLengthReader();
        List<Integer> inputLengths = lineLengthReader.read(contentRootPathRead);
        IntegerListToStringConverter integerListToStringConverter = new IntegerListToStringConverter();
        List<String> inputLengthsAsString = integerListToStringConverter.convert(inputLengths);
        FileWriter fileWriter = new FileWriter();
        fileWriter.write(contentRootPathWrite, inputLengthsAsString);

    }
}
