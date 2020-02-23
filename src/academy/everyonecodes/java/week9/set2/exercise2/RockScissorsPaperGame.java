package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.Moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.Players.Computer;
import academy.everyonecodes.java.week9.set2.exercise2.Players.Player;
import academy.everyonecodes.java.week9.set2.exercise2.Players.User;

public class RockScissorsPaperGame {

    private DecisionMaker decisionMaker = new DecisionMaker();
    private User user = new User();
    private Computer computer = new Computer();

    public void play() {
        System.out.println("Let’s play rock, paper, scissors!\n");
        boolean wantToPlay = true;
        while (wantToPlay) {
            playRound(user, computer);
            wantToPlay = askToPlayAgain(user, computer);
        }
        System.out.println("See you next time!");

    }

    private void playRound(Player user, Player computer) {
        Move move1 = user.getMove();
        Move move2 = computer.getMove();
        System.out.println("User chose: " + move1.getName());
        System.out.println("Computer chose: " + move2.getName());
        String result = decisionMaker.decideWinner(move1, move2);
        System.out.println(result);
    }

    private boolean askToPlayAgain(Player user, Player computer) {
        return user.wantsToPlay() && computer.wantsToPlay();
    }
}

