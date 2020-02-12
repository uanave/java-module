package academy.everyonecodes.java.week8.set1.exercise4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperheroCallerTest {
    SuperheroCaller caller = new SuperheroCaller();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.empty(), ""),
                Arguments.of(Optional.empty(), "batman"),
                Arguments.of(Optional.empty(), "bruce wayne"),
                Arguments.of(Optional.empty(), "Botman"),
                Arguments.of(Optional.empty(), "123"),
                Arguments.of(Optional.empty(), "Aquaman"),
                Arguments.of(Optional.of(new Batman()), "Bruce Wayne"),
                Arguments.of(Optional.of(new Batman()), "Batman"),
                Arguments.of(Optional.of(new Superman()), "Clark Kent"),
                Arguments.of(Optional.of(new Superman()), "Superman"),
                Arguments.of(Optional.of(new Spiderman()), "Peter Parker"),
                Arguments.of(Optional.of(new Spiderman()), "Spiderman")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void findSuperheroFindsHero(Optional<Superhero> oExpected, String input) {
        Optional<Superhero> oResult = caller.findSuperhero(input);

        assertEquals(oExpected, oResult);
    }
}