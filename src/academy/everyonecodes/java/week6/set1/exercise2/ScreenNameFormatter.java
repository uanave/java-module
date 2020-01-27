package academy.everyonecodes.java.week6.set1.exercise2;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;

public class ScreenNameFormatter {
    public Customer create(Customer customer) {
        customer.setName(customer.getName().toLowerCase());
        if (customer.getCustomerClass().equals("business")) {
            customer.setName(customer.getName().toUpperCase());
        }
        return customer;
    }
}
