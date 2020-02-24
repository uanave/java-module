package academy.everyonecodes.java.week10.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CreditTest {
    Credit credit = new Credit();

    @ParameterizedTest
    @CsvSource({
            "NOT SUPPORTED, 2221000000000009",
            "AMERICAN EXPRESS, 371449635398431",
            "VISA, 4111111111111111",
            "VISA, 4012888888881881",
            "NOT SUPPORTED, 3530111333300000",
            "INVALID, 0111333300000",
    })
    void test(String expected, long input) {
        String result = credit.evaluate(input);
        System.out.println(result);
        Assertions.assertEquals(expected, result);
    }

}