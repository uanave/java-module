package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalKindScholar {
    private List<Animal> animals = Animals.get();

    public String elaborate(String keyWord) {
        String animalNames = getAnimalNames(keyWord);
        if (!animalNames.isBlank()) {
            return animalNames;
        } else {
            String animalKind = getAnimalKind(keyWord);
            if (!animalKind.isBlank()) {
                return animalKind;
            }
        }
        return "";
    }

    private String getAnimalNames(String keyWord) {
        return animals.stream()
                .filter(e -> e.getAnimalKind().equals(keyWord))
                .map(Animal::getName)
                .sorted()
                .distinct()
                .collect(Collectors.joining(","));
    }

    private String getAnimalKind(String keyWord) {
        return animals.stream()
                .filter(animal -> animal.getName().equals(keyWord))
                .map(Animal::getAnimalKind)
                .distinct()
                .collect(Collectors.joining(""));
    }
}
