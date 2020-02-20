package academy.everyonecodes.java.week9.set2.exercise3.player;

import academy.everyonecodes.java.week9.set2.exercise3.move.Move;

public interface Player {
    public Move getMove();
    public boolean wantsToPlay();
}
