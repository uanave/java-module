package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.Objects;

public class Spiderman implements Superhero {
    private String privateName = "Peter Parker";
    private String superheroName = "Spiderman";

    @Override
    public String getPrivateName() {
        return privateName;
    }

    @Override
    public String getSuperheroName() {
        return superheroName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spiderman spiderman = (Spiderman) o;
        return Objects.equals(privateName, spiderman.privateName) &&
                Objects.equals(superheroName, spiderman.superheroName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateName, superheroName);
    }
}
