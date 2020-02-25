package academy.everyonecodes.java.week10.set1.exercise1.validators;

import java.util.List;

public class StartValidator implements Validator {
    private List<String> startNumbers;


    public StartValidator(List<String> startNumbers) {
        this.startNumbers = startNumbers;
    }

    @Override
    public boolean isValid(String number) {
        return startNumbers.stream().
                anyMatch(number::startsWith);
    }
}
