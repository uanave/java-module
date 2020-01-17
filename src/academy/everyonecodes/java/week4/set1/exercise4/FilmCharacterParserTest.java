package academy.everyonecodes.java.week4.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FilmCharacterParserTest {
    FilmCharacterParser filmCharacterParser = new FilmCharacterParser();

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
        Arguments.of(new FilmCharacter("Anakin", "Skywalker"), "Anakin;Skywalker"),
        Arguments.of(new FilmCharacter("Frodo", "Bagins"), "Frodo;Bagins"),
        Arguments.of(new FilmCharacter("Spongebob", "Squarepants"), "Spongebob;Squarepants")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")

    void parse(FilmCharacter expected, String input) {

        FilmCharacter result = filmCharacterParser.parse(input);
        Assertions.assertTrue(expected.getFirstName().equals(result.getFirstName()) && expected.getLastName().equals(result.getLastName()));

    }
}

