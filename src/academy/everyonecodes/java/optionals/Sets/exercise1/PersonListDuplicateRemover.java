package academy.everyonecodes.java.optionals.Sets.exercise1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonListDuplicateRemover {
    public Set<Person> remove(List<Person> persons) {
        return new HashSet<>(persons);
    }
}
