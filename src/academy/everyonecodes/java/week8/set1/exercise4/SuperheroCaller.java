package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SuperheroCaller {
    private List<Superhero> superheroes;

    public SuperheroCaller() {
        superheroes = new ArrayList<>();
        superheroes.add(new Spiderman());
        superheroes.add(new Batman());
        superheroes.add(new Superman());
    }

    public Optional<Superhero> findSuperhero(String name) {
        return superheroes.stream()
                .filter(superhero -> superhero.getSuperheroName().equals(name) || superhero.getPrivateName().equals(name))
                .findFirst();
    }
}
