package academy.everyonecodes.java.week9.set2.exercise3;

import academy.everyonecodes.java.week9.set2.exercise3.move.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class DecisionMakerTest {
    DecisionMaker decisionMaker = new DecisionMaker();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("It's a tie!", new Rock(), new Rock()),
                Arguments.of("It's a tie!", new Scissors(), new Scissors()),
                Arguments.of("It's a tie!", new Paper(), new Paper()),
                Arguments.of("It's a tie!", new Lizard(), new Lizard()),
                Arguments.of("It's a tie!", new Spock(), new Spock()),
                Arguments.of("Human wins!", new Rock(), new Scissors()),
                Arguments.of("Human wins!", new Paper(), new Rock()),
                Arguments.of("Human wins!", new Scissors(), new Paper()),
                Arguments.of("Human wins!", new Lizard(), new Paper()),
                Arguments.of("Human wins!", new Lizard(), new Spock()),
                Arguments.of("Human wins!", new Spock(), new Scissors()),
                Arguments.of("Human wins!", new Spock(), new Rock()),
                Arguments.of("Computer wins!", new Paper(), new Scissors()),
                Arguments.of("Computer wins!", new Rock(), new Paper()),
                Arguments.of("Computer wins!", new Scissors(), new Rock()),
                Arguments.of("Computer wins!", new Paper(), new Lizard()),
                Arguments.of("Computer wins!", new Paper(), new Lizard()),
                Arguments.of("Computer wins!", new Scissors(), new Spock()),
                Arguments.of("Computer wins!", new Rock(), new Spock())
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void test(String expected, Move move1, Move move2) {
        String result = decisionMaker.getScore(move1, move2);
        Assertions.assertEquals(expected, result);
    }
}