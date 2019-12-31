package academy.everyonecodes.java.christmas.Exercise4;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many episodes have you watched?");
        int numberOfEpisodes = scanner.nextInt();
        MovieTimeCalculator movieTimeCalculator = new MovieTimeCalculator();
        int timeSpent = movieTimeCalculator.calculateTimeForFirstSeason(numberOfEpisodes);
        System.out.println("The total amount of time spent watching those episodes is " + timeSpent + " minutes.");

    }
}
