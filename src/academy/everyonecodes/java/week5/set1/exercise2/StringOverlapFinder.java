package academy.everyonecodes.java.week5.set1.exercise2;

import java.util.Optional;

public class StringOverlapFinder {

    public Optional<String> find(String inputOne, String inputTwo) {
        inputOne = inputOne.trim();
        inputOne = inputOne.toLowerCase();
        inputTwo = inputTwo.trim();
        inputTwo = inputTwo.toLowerCase();
        while (!inputOne.endsWith(inputTwo)) {
            inputTwo = inputTwo.substring(0, inputTwo.length() - 1);
        }
        return Optional.of(inputTwo);
    }
}
