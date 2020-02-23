package academy.everyonecodes.java.optionals.Exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class ChatBotTest {
    ChatBot chatBot = new ChatBot();

    @ParameterizedTest
    @CsvSource({
            "Temperature, temperature",
            "Lights switched, lights"
    })
    /*void testFirstValid(String expected, String input) throws WrongFirstArgumentException {
        String result = chatBot.handleFirst(input);
        Assertions.assertEquals(expected, result);

    } */

    void testHandleFirstValid(String expected, String input) {
        Assertions.assertDoesNotThrow(() -> {
            chatBot.handleFirst(input);
        });

    }

    @ParameterizedTest
    @CsvSource({
            "Temperature",
            "Lights",
            "12222",
            "''"
    })
    void testHandleFirstNonValid(String input) {
        Assertions.assertThrows(WrongFirstArgumentException.class, () ->
                chatBot.handleFirst(input));
    }

    @ParameterizedTest
    @CsvSource({
            "on, on, lights",
            "off, off, lights",
            "lowered by 2, -2, temperature",
            "raised by 10, 10, temperature"
    })

    /*void testSecondValid(String expected, String input, String type) throws WrongSecondArgumentException {
        String result = chatBot.handleSecond(input, type);
        Assertions.assertEquals(expected, result);
    }*/

    void testHandleSecondValid(String expected, String input, String type) {
        Assertions.assertDoesNotThrow(() -> {
            chatBot.handleSecond(input, type);
        });
    }

    @ParameterizedTest
    @CsvSource({
            "35, temperature",
            "bla, temperature",
            "-33, temperature",
            "boo, lights",
            "'', ''"
    })
    void testHandleSecondNonValid(String input, String type) {
        Assertions.assertThrows(WrongSecondArgumentException.class, () ->
                chatBot.handleSecond(input, type));
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of("lights", "off"), "lights off"),
                Arguments.of(List.of("lights", "on"), "lights on"),
                Arguments.of(List.of("temperature", "5"), "temperature 5"),
                Arguments.of(List.of("temperature", "-10"), "temperature -10")
        );

    }
    @ParameterizedTest
    @MethodSource("parameters")
    void testGetInput(List<String> expected, String input) {
        List<String> result = chatBot.getList(input);
        Assertions.assertEquals(expected, result);
    }
}