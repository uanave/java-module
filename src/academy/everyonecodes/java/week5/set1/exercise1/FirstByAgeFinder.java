package academy.everyonecodes.java.week5.set1.exercise1;

import java.util.List;
import java.util.Optional;

public class FirstByAgeFinder {

    public Optional<Person> find(List<Person> input1, int inputAge) {
        if (input1.size() > 0) {
            for (Person item : input1) {
                if (item.getAge() == inputAge) {
                    return Optional.of(item);
                }
            }
            System.out.println("There's no person with that age!");
            return Optional.empty();
        }
        return Optional.empty();
    }
}
