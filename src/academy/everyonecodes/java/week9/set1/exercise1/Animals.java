package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Animals {
    public static List<Animal> get() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Mammal("dog", List.of("walk", "run"), "brown"));
        animals.add(new Mammal("gorilla", List.of("walk", "run", "climb"), "black"));
        animals.add(new Bird("goose", List.of("walk", "fly", "swim"), "white"));
        animals.add(new Bird("sparrow", List.of("jump", "fly"), "brown"));
        animals.add(new Fish("salmon", List.of("swim"), "saltwater"));
        animals.add(new Fish("angelfish", List.of("swim"), "freshwater"));
        animals.add(new Reptile("snake", List.of("crawl", "climb"), false));
        animals.add(new Reptile("snake", List.of("crawl"), true));
        animals.add(new Amphibian("frog", List.of("walk", "jump", "swim"), true));
        animals.add(new Amphibian("caecilian", List.of("crawl", "swim"), false));
        animals.add(new Arthropod("spider", List.of("walk", "climb"), 8));
        animals.add(new Arthropod("butterfly", List.of("walk", "climb", "fly"), 6));
        return animals;
    }
}
