package academy.everyonecodes.java.week4.set1.exercise4;

public class FilmCharacterParser {
    public FilmCharacter parse(String name) {
        String[] names = name.split(";");
        String firstName = names[0];
        String secondName = names[1];
        FilmCharacter filmCharacter = new FilmCharacter(firstName, secondName);
        return filmCharacter;
    }
}
