package academy.everyonecodes.java.week8.set1.exercise4;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SuperheroCallerTest {
    SuperheroCaller caller = new SuperheroCaller();

    @Test
    void testHero() {
        String input = "Clark Kent";
        Optional<Superhero> oResult = caller.findSuperhero(input);

        Superhero expected = new Superman();
        assertEquals(expected, oResult.get());
    }

    @Test
    void testNonValid() {
        String input = "John Kent";
        Optional<Superhero> result = caller.findSuperhero(input);
        assertTrue(result.isEmpty());
    }

}