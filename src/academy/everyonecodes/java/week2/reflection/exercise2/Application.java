package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;


import java.util.List;

public class Application {
    public static void main(String[] args) {
        ShopAssistant shopAssistant = new ShopAssistant();
        List<String> clients = List.of("Derek", "Hansel");
        for (String client : clients) {
            shopAssistant.walkThroughShop(client);
        }

    }
}
