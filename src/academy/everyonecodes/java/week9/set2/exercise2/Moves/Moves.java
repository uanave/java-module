package academy.everyonecodes.java.week9.set2.exercise2.Moves;

import java.util.List;

public class Moves {
    public static List<Move> get() {
        return List.of(new Rock(),
                new Paper(),
                new Scissors()
        );
    }
}
