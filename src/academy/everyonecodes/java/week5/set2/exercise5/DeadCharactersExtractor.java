package academy.everyonecodes.java.week5.set2.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DeadCharactersExtractor {
    public List<String> extract(String contentRootPath) {
        GotDataReader dataReader = new GotDataReader();
        String deathPath = "src/academy/everyonecodes/java/week5/set2/files/deaths.txt";
        Path path = Path.of(deathPath);
        List<String> personNames = new ArrayList<>();
        try {
            List<Character> characters = dataReader.read(contentRootPath);
            for (Character person : characters) {
                if (person.getBookOfDeath() != -1) {
                    personNames.add(person.getName());
                }
            }
            Files.write(path, personNames);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personNames;

    }
}
