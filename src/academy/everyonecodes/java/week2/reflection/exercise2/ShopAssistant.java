package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;
import academy.everyonecodes.java.week2.reflection.exercise1.Product;


import java.util.List;
import java.util.Scanner;

public class ShopAssistant {
    public Cart walkThroughShop(String name) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, " + name + " welcome to our shop!");
        System.out.println("What do you want to buy?");
        String product = scanner.nextLine();
        if (!product.equals("")) {
        }
        System.out.println("How much does it cost?");
        int price = scanner.nextInt();
        Product item = new Product(product, price);
        product = scanner.nextLine();

        System.out.println("How many do you want?");
        int amount = scanner.nextInt();
        CartItem cartItem = new CartItem(item, amount);
        product = scanner.nextLine();


        System.out.println("Thank you, we will put that in the cart!");
        List<CartItem> items = List.of(cartItem);
        Cart cart = new Cart(items, name);
        product = scanner.nextLine();


        System.out.println("What do you want to buy?");
        product = scanner.nextLine();
        if (product.equals(" ")) {

        }
        return cart;
    }
}

