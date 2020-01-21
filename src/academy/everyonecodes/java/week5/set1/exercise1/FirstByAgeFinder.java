package academy.everyonecodes.java.week5.set1.exercise1;

import java.util.List;
import java.util.Optional;

public class FirstByAgeFinder {

    public Optional<Person> find(List<Person> people, int inputAge) {
        if (people.size() > 0) {
            for (Person item : people) {
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
