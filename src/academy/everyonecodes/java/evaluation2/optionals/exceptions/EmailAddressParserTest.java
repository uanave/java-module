package academy.everyonecodes.java.evaluation2.optionals.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailAddressParserTest {
    EmailAddressParser parser = new EmailAddressParser();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new EmailAddress("john123", "gmail.com"), "john123@gmail.com")
        );
    }


    @ParameterizedTest
    @MethodSource("parameters")
    void testParseValid(EmailAddress expected, String input) throws InvalidEmailException {
        Optional<EmailAddress> result = parser.parse(input);
        assertEquals(expected.hashCode(), result.hashCode());
    }

    @ParameterizedTest
    @CsvSource({
            "john",
            "@gmail",
            "tralala@",
            "''"
    })
    void testParseNonValid(String input) throws InvalidEmailException {
        Assertions.assertThrows(InvalidEmailException.class, () ->
                parser.parse(input));
    }
}