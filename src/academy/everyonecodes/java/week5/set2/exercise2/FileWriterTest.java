package academy.everyonecodes.java.week5.set2.exercise2;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileWriterTest {
    FileWriter fileWriter = new FileWriter();
    FileReader fileReader = new FileReader();
    String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/cats.txt";


    @Test
    void write() {
        List<String> input = List.of("gentleman", "ron", "joe", "spartacus");

        fileWriter.write(contentRootPath, input);

        List<String> inputList = fileReader.read(contentRootPath);

        List<String> expected = List.of("gentleman", "ron", "joe", "spartacus");
        Assertions.assertEquals(expected, inputList);
        System.out.println(inputList);
    }

    @Test
    void append() {
        List<String> input1 = List.of("Vincent price tip top old bean handsome circus strongman groucho marx, vincent price charity donate ian rush Daniel plainview handsome circus strongman lorreto del mar off-piste socially mobile Daniel plainview groucho marx tip top old bean nuremberg rally?");

        fileWriter.append(contentRootPath, input1);

        List<String> input2 = List.of("Mouthbrow vincent price man of the year 1986 lando calrissian.");

        fileWriter.append(contentRootPath, input2);

        List<String> inputList = fileReader.read(contentRootPath);

        List<String> expected = List.of("Vincent price tip top old bean handsome circus strongman groucho marx, vincent price charity donate ian rush Daniel plainview handsome circus strongman lorreto del mar off-piste socially mobile Daniel plainview groucho marx tip top old bean nuremberg rally?", "Mouthbrow vincent price man of the year 1986 lando calrissian.");
        Assertions.assertEquals(expected, inputList);
        System.out.println(inputList);

    }

    @AfterEach
    void deleteNewNameFile() {
        String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/cats.txt";
        Path path = Path.of(contentRootPath);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
