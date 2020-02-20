package academy.everyonecodes.java.week9.set2.exercise3.player;

import academy.everyonecodes.java.week9.set2.exercise3.move.Move;
import academy.everyonecodes.java.week9.set2.exercise3.move.Moves;

import java.util.List;
import java.util.Random;

public class ComputerPlayer implements Player {
    private List<Move> moves = Moves.getMoves();
    private Random random = new Random();

    @Override
    public Move getMove() {
        int index = random.nextInt(moves.size());
        return moves.get(index);
    }

    @Override
    public boolean wantsToPlay() {
        return true;
    }
}
