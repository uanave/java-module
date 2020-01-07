package academy.everyonecodes.java.week3.set1.exercise4;

public class GenerateNewName {
    public String generateName(String name) {
            String newName = name.replaceAll("jpg", "png");
            return newName;
    }
}

