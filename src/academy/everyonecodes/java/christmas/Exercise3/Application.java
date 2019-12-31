package academy.everyonecodes.java.christmas.Exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Burger burger1 = new Burger("Big Gear Burger", 6.5);
        Burger burger2 = new Burger("Mc Buttons Long Burger", 7.2);
        Burger burger3 = new Burger("Veggie Circuits Burger", 5.7);
        Burger fries = new Burger("Fries", 2.5);
        List<Burger> menu = List.of(burger1, burger2, burger3);

        System.out.println("Good day! What burger do you want?");
        Scanner scanner = new Scanner(System.in);
        String burgerName = scanner.nextLine();
        double total = 0;

        if (!burgerName.equals("")) {
            for (Burger burger : menu) {
                if (burgerName.equals(burger.getName())) {
                    total = burger.getPrice();
                    System.out.println("Do you want french fries with that?");
                    String answer = scanner.nextLine();
                    if (answer.equals("Yes")) {
                        total = total + fries.getPrice();
                    }
                    System.out.println("It's " + total + " Euros, please.");
                }
            }
        } else {
            System.out.println("Please choose something from the menu!");
        }


    }
}
