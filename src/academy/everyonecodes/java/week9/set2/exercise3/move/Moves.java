package academy.everyonecodes.java.week9.set2.exercise3.move;

import java.util.List;

public class Moves {
    static List<Move> moves = List.of(
            new Rock(),
            new Paper(),
            new Scissors(),
            new Lizard(),
            new Spock()
    );
    public static List<Move> getMoves() {
        return moves;
    }
}
