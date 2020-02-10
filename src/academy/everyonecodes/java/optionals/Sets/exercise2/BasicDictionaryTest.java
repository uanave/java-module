package academy.everyonecodes.java.optionals.Sets.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

class BasicDictionaryTest {
    BasicDictionary basicDictionary = new BasicDictionary();

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(Set.of("the", "elegant", "jumped", "up"), "The elegant cat jumped up the table"),
                Arguments.of(Set.of(), ""),
                Arguments.of(Set.of(), "Hi house dog cat table chair elephant"),
                Arguments.of(Set.of("the"), "Hi the house dog cat table chair elephant")

        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void test(Set<String> expected, String input) {
        Set<String> result = basicDictionary.findUnknownWords(input);
    }
}