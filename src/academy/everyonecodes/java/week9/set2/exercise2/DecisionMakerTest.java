package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.Moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.Moves.Paper;
import academy.everyonecodes.java.week9.set2.exercise2.Moves.Rock;
import academy.everyonecodes.java.week9.set2.exercise2.Moves.Scissors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class DecisionMakerTest {
    DecisionMaker maker = new DecisionMaker();

    static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("User wins!", new Rock(), new Scissors()),
                Arguments.of("User wins!", new Paper(), new Rock()),
                Arguments.of("User wins!", new Scissors(), new Paper()),
                Arguments.of("Computer wins!", new Scissors(), new Rock()),
                Arguments.of("Computer wins!", new Rock(), new Paper()),
                Arguments.of("Computer wins!", new Paper(), new Scissors()),
                Arguments.of("It's a tie!", new Paper(), new Paper()),
                Arguments.of("It's a tie!", new Rock(), new Rock()),
                Arguments.of("It's a tie!", new Scissors(), new Scissors())
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void test(String expected, Move move1, Move move2) {
        String result = maker.decideWinner(move1, move2);
        Assertions.assertEquals(expected, result);
    }


}