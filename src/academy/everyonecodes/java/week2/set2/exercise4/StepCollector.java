package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepCollector {
    public List<Integer> collect() {
        List<Integer> steps = new ArrayList<>();
        List<String> friends = List.of("Matilda", "Hansel", "Derek");
        for (String friend : friends) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(friend + ", how many steps did you took?");
            int step = scanner.nextInt();
            steps.add(step);

        }
        return steps;
    }
}
