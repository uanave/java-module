package academy.everyonecodes.java.week6.set1.exercise2;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ScreenNameFormatterTest {
    ScreenNameFormatter screenNameFormatter = new ScreenNameFormatter();

    @ParameterizedTest
    @CsvSource({
            "john, John, something else",
            "mary, Mary, economy",
            "JENA, jena, business"
    })
    void create(String expected, String name, String customerClass) {
        Customer firstCustomer = new Customer(name, customerClass);

        String customerName = screenNameFormatter.format(firstCustomer);
        Assertions.assertEquals(expected, customerName);
    }
}
