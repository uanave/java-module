package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ShopAssistant shopAssistant = new ShopAssistant();
        Cart hanselCart = shopAssistant.walkThroughShop("Hansel");
        Cart derekCart = shopAssistant.walkThroughShop("Derek");

        Cashier cashier = new Cashier();
        cashier.billCustomer(hanselCart);
        cashier.billCustomer(derekCart);



    }
}
