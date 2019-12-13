package academy.everyonecodes.java.week1.reflection.exercise2;

import java.util.Scanner;

public class RoboMentalist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say a number from 1 to 10");
        int number = scanner.nextInt();
        if (number < 1 || number > 10) {
            while (number < 1 || number > 10) {
                System.out.println("Say a number from 1 to 10");
                number = scanner.nextInt();
            }
        } else {
            System.out.println("Alright! Let's perform a trick with " + number);
        }
    }
}
