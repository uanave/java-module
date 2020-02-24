package academy.everyonecodes.java.week10.set1.exercise1.validators;

import java.util.List;

public class ValidateStart implements Validator {

    private final List<String> starts = List.of("4", "34", "37", "51", "52", "53", "54", "55");

    @Override
    public boolean isValid(String string) {
        String startsWith = string.substring(0, 2);
        return (starts.contains(startsWith));
    }
}
