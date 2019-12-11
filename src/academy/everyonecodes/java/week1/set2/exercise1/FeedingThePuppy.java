package academy.everyonecodes.java.week1.set2.exercise1;

import java.util.Scanner;

public class FeedingThePuppy {

    public static int calculateJumps(int foodType) {
        return 6 * foodType;
    }

    public static int calculateBarks(int foodType) {
        return 1 + foodType;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("- Woof food do I get today?");
        int foodType = scanner.nextInt();
        if ((foodType != 0) && (foodType != 1)) {
            System.out.println("Please enter a valid number!");
        } else {
            int jumps = calculateJumps(foodType);
            int barks = calculateBarks(foodType);
            System.out.println("I will jump " + jumps + " times and bark " + barks + " times");
        }

    }
}

