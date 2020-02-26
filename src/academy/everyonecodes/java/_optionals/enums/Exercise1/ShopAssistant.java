package academy.everyonecodes.java._optionals.enums.Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopAssistant {
    private Shop shop;

    public ShopAssistant(Shop shop) {
        this.shop = shop;
    }

    private Size askForSize() {
        System.out.println("What size do you need?");
        Scanner scanner = new Scanner(System.in);
        return Size.valueOf(scanner.nextLine());
    }

    private List<TShirt> findShirtsThatFit(Size size) {
        List<TShirt> availableTShirts = shop.getAvailableTShirts();
        List<TShirt> matchedShirts = new ArrayList<>();
        for (TShirt shirt : availableTShirts) {
            if (shirt.getSize() == size) {
                matchedShirts.add(shirt);
            }
        }
        return matchedShirts;
    }

    public void dealWithCustomer() {
        System.out.println("Welcome to Everyone Shops!");
        Size size = askForSize();
        List<TShirt> matchedTShirts = findShirtsThatFit(size);
        if (matchedTShirts.size() > 0) {
            for (TShirt shirt : matchedTShirts) {
                System.out.println("We have a " + shirt.getColor() + " shirt for " + shirt.getPrice() + " Euro.");
            }
        } else {
            System.out.println("I'm sorry, we have no shirts available for your size.");
        }
    }

}
