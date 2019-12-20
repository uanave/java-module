package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;

public class Cashier {
    public void billCustomer(Cart cart) {
        double sum = 0;
        for (CartItem cartItem : cart.getCartItems()) {
            int sumProduct = cartItem.getInstance() * cartItem.getProduct().getPrice();
            sum = sum + sumProduct;
        }
        System.out.println(cart.getOwner() + " has to pay " + sum);
    }
}
