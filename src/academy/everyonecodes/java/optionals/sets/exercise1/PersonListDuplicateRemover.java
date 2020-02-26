package academy.everyonecodes.java.evaluation2.optionals.Sets.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PersonListDuplicateRemover {
    public List<Person> remove(List<Person> listWithDuplicates) {
        return new ArrayList<>(new HashSet<>(listWithDuplicates));
    }
}
