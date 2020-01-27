package academy.everyonecodes.java.week6.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerUpgraderTest {
    CustomerUpgrader customerUpgrader = new CustomerUpgrader();

    @Test
    void upgradeEconomy() {
        Customer input = new Customer("John", "economy");

        Customer expected = new Customer("John", "business");

        Customer result = customerUpgrader.upgrade(input);
        Assertions.assertEquals(expected.getName(), result.getName());
        Assertions.assertEquals(expected.getCustomerClass(), result.getCustomerClass());
    }

    @Test
    void upgradeBusiness() {
        Customer input = new Customer("John", "business");

        Customer expected = new Customer("John", "business");

        Customer result = customerUpgrader.upgrade(input);
        Assertions.assertEquals(expected.getName(), result.getName());
        Assertions.assertEquals(expected.getCustomerClass(), result.getCustomerClass());
    }
}
