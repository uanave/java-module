package academy.everyonecodes.java.week6.set1.exercise2;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScreenNameFormatterTest {
    ScreenNameFormatter screenNameFormatter = new ScreenNameFormatter();

    @Test
    void createEconomy() {
        Customer input = new Customer("John", "economy");
        Customer expected = new Customer("john", "economy");

        Customer result = screenNameFormatter.create(input);
        Assertions.assertEquals(expected.getName(), result.getName());
        Assertions.assertEquals(expected.getCustomerClass(), result.getCustomerClass());
    }

    @Test
    void createBusiness() {
        Customer input = new Customer("John", "business");
        Customer expected = new Customer("JOHN", "business");

        Customer result = screenNameFormatter.create(input);
        Assertions.assertEquals(expected.getName(), result.getName());
        Assertions.assertEquals(expected.getCustomerClass(), result.getCustomerClass());
    }

    @Test
    void createWrongClass() {
        Customer input = new Customer("JOHN", "Economy");

        Customer expected = new Customer("john", "economy");

        Customer result = screenNameFormatter.create(input);
        Assertions.assertEquals(expected.getName(), expected.getName());
    }
}
