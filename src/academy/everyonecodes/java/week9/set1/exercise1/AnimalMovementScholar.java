package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalMovementScholar {
    private List<Animal> animals = Animals.get();

    public List<String> elaborate(String keyword) {
        List<String> movementsByKind = getMovementsByKind(keyword);
        if (!movementsByKind.isEmpty()) {
            return movementsByKind;
        } else {
            List<String> movementsByName = getMovementsByName(keyword);
            if (!movementsByName.isEmpty()) {
                return movementsByName;
            }
        }
        return new ArrayList<>();
    }

    private List<String> getMovementsByKind(String keyword) {
        return animals.stream()
                .filter(animal -> animal.getAnimalKind().equals(keyword))
                .flatMap(animal -> animal.getMovement().stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    private List<String> getMovementsByName(String keyword) {
        return animals.stream()
                .filter(animal -> animal.getName().equals(keyword))
                .flatMap(animal -> animal.getMovement().stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
