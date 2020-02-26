package academy.everyonecodes.java.evaluation2.optionals.Maps.exercise1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringsToLengthMapper {
    public Map<String, Integer> map(List<String> input) {
        if (input.isEmpty()) {
            return new HashMap<>();
        }
        return input.stream()
                .collect(Collectors.toMap(c -> c, String::length));
    }
}
