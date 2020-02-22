package academy.everyonecodes.java.optionals.Exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ChatBotTest {
    ChatBot chatBot = new ChatBot();

    @ParameterizedTest
    @CsvSource({
            "Temperature, temperature",
            "Lights switched, lights"
    })
    void testFirstValid(String expected, String input) throws WrongFirstArgumentException {
        String result = chatBot.handleFirst(input);
        Assertions.assertEquals(expected, result);

    }

  /*  void testFirstValid() throws WrongFirstArgumentException {
        Assertions.assertDoesNotThrow(() -> {});

    } */

    @ParameterizedTest
    @CsvSource({
            "Temperature",
            "Lights",
            "12222"
    })
    void testFirstNonValid(String input) throws WrongFirstArgumentException {
        Assertions.assertThrows(WrongFirstArgumentException.class, () -> {
            chatBot.handleFirst(input);
        });
    }

    @ParameterizedTest
    @CsvSource({
            "on, on, lights",
            "off, off, lights",
            "lowered by 2, -2, temperature",
            "raised by 10, 10, temperature"
    })

//    void testSecondValid(String expected, String input, String type) throws WrongSecondArgumentException {
//        String result = chatBot.handleSecond(input, type);
//        Assertions.assertEquals(expected, result);
//    }

    void testSecondValid() throws WrongSecondArgumentException {
        Assertions.assertDoesNotThrow(() -> {
        });
    }

    @ParameterizedTest
    @CsvSource({
            "35, temperature",
            "bla, temperature",
            "-33, temperature",
            "boo, lights"
    })
    void testSecondNonValid(String input, String type) throws WrongSecondArgumentException {
        Assertions.assertThrows(WrongSecondArgumentException.class, () -> {
            chatBot.handleSecond(input, type);
        });
    }
}