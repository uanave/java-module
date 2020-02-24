package academy.everyonecodes.java.week10.set1.exercise1.validators;

import java.util.List;

public class Validators {
    public static List<Validator> get() {
        return List.of(
                new ValidateLength(),
                new ValidateStart()
        );
    }
}
