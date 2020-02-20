package academy.everyonecodes.java.week9.set2.exercise3;

import academy.everyonecodes.java.week9.set2.exercise3.move.Move;
import academy.everyonecodes.java.week9.set2.exercise3.player.ComputerPlayer;
import academy.everyonecodes.java.week9.set2.exercise3.player.HumanPlayer;
import academy.everyonecodes.java.week9.set2.exercise3.player.Player;

public class RockPaperScissorsGame {
    private DecisionMaker decisionMaker = new DecisionMaker();
    private Player human = new HumanPlayer();
    private Player computer = new ComputerPlayer();

    public void play() {
        System.out.println("Let's start the game!");

        playOneRound();
        wantsToPlay();
    }

    private void wantsToPlay() {
        boolean wantsToPlay1 = human.wantsToPlay();
        boolean wantsToPlay2 = computer.wantsToPlay();
        if (wantsToPlay1 && wantsToPlay2) {
            playOneRound();
        } else {
            System.out.println("See you next time!\n");

        }

    }

    private void playOneRound() {

        Move move1 = human.getMove();
        Move move2 = computer.getMove();
        System.out.println("Human chose : " + move1.getName());
        System.out.println("Computer chose : " + move2.getName());
        String result = decisionMaker.getScore(move1, move2);
        System.out.println(result);
    }
}
