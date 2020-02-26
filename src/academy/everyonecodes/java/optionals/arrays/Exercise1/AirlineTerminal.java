package academy.everyonecodes.java.evaluation2.optionals.Arrays.Exercise1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AirlineTerminal {
    private String[] getItems() {
        Scanner scanner = new Scanner(System.in);
        String[] items = new String[5];

        System.out.println("Please tell me your 5 items");
        for (int i = 0; i < items.length; i++) {
            items[i] = scanner.nextLine();
        }
        return items;
    }

    private boolean isAnItemSuspicious(String[] items) {
        List<String> itemsAsList = Arrays.asList(items);
        return itemsAsList.contains("Bomb");
    }

    public void doPassengerCheckIn() {
        System.out.println("WELCOME TO EC AIRLINES!");
        String[] items = getItems();
        System.out.println("Thank you for boarding, we will check your items...");
        if (isAnItemSuspicious(items)) {
            System.out.println("Sorry, we cannot allow you to proceed!");
        } else {
            System.out.println("All items are good to go. Enjoy your flight!");
        }
    }
}

