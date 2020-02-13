package academy.everyonecodes.java.optionals.Sets.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonListDuplicateRemover {
    public List<Person> remove(List<Person> listWithDuplicates) {
        return new ArrayList<>(new HashSet<>(listWithDuplicates));
    }
}
