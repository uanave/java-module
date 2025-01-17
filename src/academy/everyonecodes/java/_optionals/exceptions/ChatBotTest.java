package academy.everyonecodes.java._optionals.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class ChatBotTest {
    ChatBot chatBot = new ChatBot();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of("lights", "off"), "lights off"),
                Arguments.of(List.of("lightson"), "lightson"),
                Arguments.of(List.of("temperature", "5"), "temperature 5"),
                Arguments.of(List.of("temperature", "bla"), "temperature bla")
        );
    }

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
            "temperatureon",
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

    @ParameterizedTest
    @MethodSource("parameters")
    void testGetInputValid(List<String> expected, String input) throws WrongFirstArgumentException {
        List<String> result = chatBot.getList(input);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"'Argument not suported: Please enter a valid command!', 'lights'",
            "'Argument not suported: Please enter a valid command!', 'temperature'"}

            )
    void testGetInputNonValid(String input) throws WrongFirstArgumentException {
        Assertions.assertThrows(WrongFirstArgumentException.class, () -> chatBot.getList(input));
    }
}