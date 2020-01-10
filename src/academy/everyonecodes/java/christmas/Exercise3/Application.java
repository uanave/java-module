package academy.everyonecodes.java.christmas.Exercise3;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        BurgerAndFries burger1 = new BurgerAndFries("Big Gear Burger", 6.5);
        BurgerAndFries burger2 = new BurgerAndFries("Mc Buttons Long Burger", 7.2);
        BurgerAndFries burger3 = new BurgerAndFries("Veggie Circuits Burger", 5.7);
        BurgerAndFries fries = new BurgerAndFries("Fries", 2.5);
        List<BurgerAndFries> menu = List.of(burger1, burger2, burger3);

        System.out.println("Good day! What burger do you want?");
        Scanner scanner = new Scanner(System.in);
        String burgerName = scanner.nextLine();
        double total = 0;

        if (!burgerName.equals("")) {
            for (BurgerAndFries burgerAndFries : menu) {
                if (burgerName.equals(burgerAndFries.getName())) {
                    total = burgerAndFries.getPrice();
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