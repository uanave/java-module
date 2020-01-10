package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;
import academy.everyonecodes.java.week2.reflection.exercise1.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopAssistant {
    public Cart walkThroughShop(String name) {
        System.out.println("Hello, " + name + " welcome to our shop!");
        List<CartItem> cartItems = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to buy?");
        String product = scanner.nextLine();

        while (!product.equals("")) {
            System.out.println("How much does it cost?");
            double price = scanner.nextDouble();
            product = scanner.nextLine();

            System.out.println("How many do you want?");
            int amount = scanner.nextInt();
            product = scanner.nextLine();

            Product item = new Product(product, price);
            CartItem newCartItem = new CartItem(item, amount);
            cartItems.add(newCartItem);

            System.out.println("What do you want to buy?");
            product = scanner.nextLine();

        }

        Cart cart = new Cart(cartItems, name);
        System.out.println("Thank you for shopping with us!");

        return cart;
    }
}

