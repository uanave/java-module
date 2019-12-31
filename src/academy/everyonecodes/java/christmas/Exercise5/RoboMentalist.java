package academy.everyonecodes.java.christmas.Exercise5;

import java.util.Scanner;

public class RoboMentalist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say a number between 1 and 10!");
        int number = scanner.nextInt();
        while ((number > 10) || (number < 1)) {
            System.out.println("Say a number between 1 and 10!");
            number = scanner.nextInt();
        }
        System.out.println("Alright! Let's perform a trick with that number");
    }
}
