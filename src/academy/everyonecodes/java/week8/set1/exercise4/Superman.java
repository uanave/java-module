package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.Objects;

public class Superman implements Superhero {
    private String privateName = "Clark Kent";
    private String superheroName = "Superman";

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
        Superman superman = (Superman) o;
        return Objects.equals(privateName, superman.privateName) &&
                Objects.equals(superheroName, superman.superheroName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateName, superheroName);
    }
}
