package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class AnimalMovementScholarTest {
    AnimalMovementScholar animalMovementScholar = new AnimalMovementScholar();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of("climb", "run", "walk"), "mammal"),
                Arguments.of(List.of(), "cat"),
                Arguments.of(List.of("crawl", "jump", "swim", "walk"), "amphibian"),
                Arguments.of(List.of("run", "walk"), "dog")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void test(List<String> expected, String input) {
        List<String> result = animalMovementScholar.elaborate(input);
        System.out.println(result);
        Assertions.assertEquals(expected, result);
    }
}