package academy.everyonecodes.java.optionals.sets.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class BasicDictionaryTest {
    BasicDictionary basicDictionary = new BasicDictionary();

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(List.of("the", "elegant", "jumped", "up"), "The elegant cat jumped up the table"),
                Arguments.of(List.of(), ""),
                Arguments.of(List.of(), "Hi house dog cat table chair elephant"),
                Arguments.of(List.of("the"), "Hi the house dog cat table chair elephant")
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void test(List<String> expected, String input) {
        List<String> result = basicDictionary.findUnknownWords(input);
        Assertions.assertEquals(expected, result);
    }
}