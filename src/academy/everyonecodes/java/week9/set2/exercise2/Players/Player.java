package academy.everyonecodes.java.week9.set2.exercise2.Players;

import academy.everyonecodes.java.week9.set2.exercise2.Moves.Move;

public interface Player {

    public abstract Move getMove();
    public abstract boolean wantsToPlay();
}
