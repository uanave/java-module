package academy.everyonecodes.java.optionals.Maps.exercise1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringsToLengthMapper {
    public Map<String, Integer> map(List<String> input) {
        try {
            return input.stream()
                    .collect(Collectors.toMap(c -> c, String::length));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }
}
