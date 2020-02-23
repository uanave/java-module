package academy.everyonecodes.java.week9.set2.exercise2.Players;

import academy.everyonecodes.java.week9.set2.exercise2.Moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.Moves.Moves;

import java.util.List;
import java.util.Random;

public class Computer implements Player {


    @Override
    public Move getMove() {
        Random random = new Random();
        List<Move> moves = Moves.get();
        return moves.get(random.nextInt(moves.size() - 1));
    }

    @Override
    public boolean wantsToPlay() {
        return true;
    }
}
