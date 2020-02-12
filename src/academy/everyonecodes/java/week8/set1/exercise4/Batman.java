package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.Objects;

public class Batman implements Superhero {
    private String privateName = "Bruce Wayne";
    private String superheroName = "Batman";

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
        Batman batman = (Batman) o;
        return Objects.equals(privateName, batman.privateName) &&
                Objects.equals(superheroName, batman.superheroName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateName, superheroName);
    }
}
