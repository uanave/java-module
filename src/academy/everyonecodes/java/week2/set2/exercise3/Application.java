package academy.everyonecodes.java.week2.set2.exercise3;

import static academy.everyonecodes.java.week2.set2.exercise3.HikeDisplayer.display;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Hike hike = new Hike("5 November 2020", HikeGatherer.gather());
        display(hike);

    }
}
