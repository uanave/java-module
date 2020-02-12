package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class SuperheroCaller {
    private List<Superhero> superheroes;

    public SuperheroCaller() {
        superheroes = List.of(new Batman(), new Superman(), new Spiderman());
    }

    public Optional<Superhero> findSuperhero(String name) {
        return superheroes.stream()
                .filter(matchesPrivateNameOrSuperheroName(name))
                .findFirst();
    }

    private Predicate<Superhero> matchesPrivateNameOrSuperheroName(String name) {
        return superhero -> superhero.getSuperheroName().equals(name) || superhero.getPrivateName().equals(name);
    }
}
