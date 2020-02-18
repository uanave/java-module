package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.List;

public class Animal {
    private String name;
    private String animalKind;
    private List<String> movement;

    public Animal(String name, String animalKind, List<String> movement) {
        this.name = name;
        this.animalKind = animalKind;
        this.movement = movement;
    }

    public String getName() {
        return name;
    }

    public String getAnimalKind() {
        return animalKind;
    }

    public List<String> getMovement() {
        return movement;
    }
}
