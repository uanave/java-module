package academy.everyonecodes.java.optionals.enums.Exercise2;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Scanner;

public class Calendar {
    public DayOfWeek askForDay() {
        System.out.println("What day of the week is it?");
        Scanner scanner = new Scanner(System.in);
        return DayOfWeek.of(scanner.nextInt());
    }

    public Month askForMonth() {
        System.out.println("What month is it?");
        Scanner scanner = new Scanner(System.in);
        return Month.of(scanner.nextInt());
    }
}
