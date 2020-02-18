package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AnimalKindScholarTest {
    AnimalKindScholar animalKindScholar = new AnimalKindScholar();

    @ParameterizedTest
    @CsvSource({
            "'dog,gorilla', 'mammal'",
            "'angelfish,salmon', 'fish'",
            "'', 'horse'",
            "arthropod, spider",
            "reptile, snake"

    })
    void test(String expected, String input) {
        String result = animalKindScholar.elaborate(input);
        Assertions.assertEquals(expected, result);
    }
}