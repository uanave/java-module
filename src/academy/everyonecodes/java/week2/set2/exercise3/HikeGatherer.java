package academy.everyonecodes.java.week2.set2.exercise3;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class HikeGatherer {
    public static List<Hiker> gather() {
        Scanner scanner = new Scanner(System.in);
        List<Hiker> hikers = new ArrayList<>();
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        while(!name.equals("")) {
            System.out.println("What's your telephone number?");
            int telephoneNumber = scanner.nextInt();
            scanner.nextLine();

            Hiker hiker = new Hiker(name, telephoneNumber);
            hikers.add(hiker);

            System.out.println("What is your name?");
            name = scanner.nextLine();

        }

        return hikers;
    }
}
