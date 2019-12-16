package academy.everyonecodes.java.week2.set1.exercise2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the color of the car?");
        String color = scanner.nextLine();

        System.out.println("When was the car built?");
        int year = scanner.nextInt();

        Car audi = new Car(color, year);
        System.out.println("The car is " + audi.getColor() + " and was built in " + audi.getYearBuilt());

    }
}
