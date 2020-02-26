package academy.everyonecodes.java._optionals.sets.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntegerListDuplicateRemover {
    public List<Integer> remove(List<Integer> listWithDuplicates) {
        return new ArrayList<>(new HashSet<>(listWithDuplicates));
    }
}
