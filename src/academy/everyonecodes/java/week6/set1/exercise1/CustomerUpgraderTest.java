package academy.everyonecodes.java.week6.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CustomerUpgraderTest {
    CustomerUpgrader customerUpgrader = new CustomerUpgrader();

    @ParameterizedTest
    @CsvSource({
            "business, John, economy",
            "business, John, business"
    })
    void upgrade(String expected, String name, String customerClass) {
        Customer firstCustomer = new Customer(name, customerClass);

        customerUpgrader.upgrade(firstCustomer);

        Assertions.assertEquals(expected, firstCustomer.getCustomerClass());
    }



    /* @ParameterizedTest
    @MethodSource("testCasesProvider")
    void upgrade(String expectedClass, Customer input) {
        Customer result = customerUpgrader.upgrade(input);
        String resultingClass = result.getCustomerClass();
        Assertions.assertEquals(expectedClass, resultingClass);
    }
    private static Stream<Arguments> testCasesProvider() {
        Customer one = new Customer("Riccardo", "economy");
        Customer two = new Customer("Sercan", "business");
        Customer three = new Customer("Oana", "Economy");
        return Stream.of(
                Arguments.of("business", one),
                Arguments.of("business", two),
                Arguments.of("business", three)
        );
    } */
}
