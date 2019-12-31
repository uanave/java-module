package academy.everyonecodes.java.christmas.Exercise10;

import java.util.Scanner;

public class CheckPerson {
    public boolean isAdult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you 18 or older?");
        return scanner.nextBoolean();
    }

    public boolean isWearingAHat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you wearing a hat?");
        return scanner.nextBoolean();
    }

    public boolean knowsSecretPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the secret password?");
        String password = scanner.nextLine();
        return password.equals("Hokopoko");
    }
}
