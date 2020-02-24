package academy.everyonecodes.java.week10.set1.exercise1.validators;

import java.util.List;

public class ValidateLength implements Validator {

    private final List<Integer> lengths = List.of(13, 15, 16);

    @Override
    public boolean isValid(String string) {
        return false;
    }
}
